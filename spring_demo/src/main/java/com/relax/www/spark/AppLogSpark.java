package com.relax.www.spark;

import com.hfjy.base.util.JSONUtil;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.Map;

/**
 * @author wusong
 * @create 2018-01-19 15:15
 **/
public class AppLogSpark {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AppLogSpark").setMaster("local");
        System.setProperty("hadoop.home.dir", "/usr/local/spark2.2-hadoop2.7");
        JavaSparkContext context = new JavaSparkContext(conf);
        JavaRDD<String> accessLogRdd = context.textFile("/Users/wusong/Downloads/app_log.txt");
        JavaPairRDD<String, AccessLogInfo> javaPairRDD = mapAccessLog2Pair(accessLogRdd);
        JavaPairRDD<String, AccessLogInfo> aggregateByDeviceId = aggregateByDeviceId(javaPairRDD);
        Map<String, AccessLogInfo> logInfoMap = javaPairRDD.collectAsMap();
        System.out.println(JSONUtil.toString(logInfoMap));
        context.close();
    }

    private static JavaPairRDD<String, AccessLogInfo> mapAccessLog2Pair(JavaRDD<String> accessLogRdd) {
        return accessLogRdd.mapToPair(new PairFunction<String, String, AccessLogInfo>() {
            private static final long serialVersionUID = 1;

            @Override
            public Tuple2<String, AccessLogInfo> call(String accessLog) throws Exception {
                String[] items = accessLog.split("\t");
                long timeStamp = Long.parseLong(items[0]);
                String deviceId = items[1];
                long upTraffic = Long.parseLong(items[2]);
                long downTraffic = Long.parseLong(items[3]);
                AccessLogInfo accessLogInfo = new AccessLogInfo(timeStamp, upTraffic, downTraffic);
                return new Tuple2<>(deviceId, accessLogInfo);
            }
        });
    }

    //根据deviceID做聚合
    private static JavaPairRDD<String, AccessLogInfo> aggregateByDeviceId(JavaPairRDD<String, AccessLogInfo> javaPairRDD) {

        return javaPairRDD.reduceByKey(new Function2<AccessLogInfo, AccessLogInfo, AccessLogInfo>() {
            private static final long serialVersionUID = 1;

            @Override
            public AccessLogInfo call(AccessLogInfo accessLogInfo1, AccessLogInfo accessLogInfo2) throws Exception {
                Long timeStamp = accessLogInfo1.getTimeStramp() < accessLogInfo2.getTimeStramp() ? accessLogInfo1.getTimeStramp() : accessLogInfo2.getTimeStramp();
                long upTraffic = accessLogInfo1.getUpTraffic() + accessLogInfo2.getUpTraffic();
                long downTraffic = accessLogInfo1.getDownTraffic() + accessLogInfo2.getDownTraffic();
                AccessLogInfo accessLogInfo = new AccessLogInfo(timeStamp, upTraffic, downTraffic);
                return accessLogInfo;
            }
        });
    }

}
