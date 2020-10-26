/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: ExportAnalysisUserInfo.java 
 * @Package: com.relax.www.mongodb
 * @date: 2016年7月1日-上午10:41:35
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.mongodb;

import com.hfjy.base.db.mongodb.MongoDBManager;
import com.hfjy.base.db.mongodb.MongoDBServer;
import com.hfjy.base.db.mongodb.bean.Condition;
import com.hfjy.base.util.StringUtil;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.sun.rowset.internal.Row;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * @ClassName: ExportAnalysisUserInfo
 * @Description: TODO(导出分析mongodb的数据信息 )
 * @author no_relax
 * @date 2016年7月1日 上午10:41:35
 * 
 */
public class ExportAnalysisUserInfo extends AbstractHandler {
	private static Logger log = LoggerFactory.getLogger(ExportAnalysisUserInfo.class);

	// 用户的注册或登录统计
	@Test
	public void registerOrLoginReport() throws Exception {/*
		Condition condition = Condition.init();
		Date lastDay = DateUtils.nextDate(DateUtils.getDay(), DateType.DAY, -1);
		String lastDayStr = DateUtils.formatDate(lastDay, "yyyy-MM-dd");
		Date lastWeekDay = DateUtils.nextDate(DateUtils.getDay(), DateType.DAY, -7);
		String lastWeekDayStr = DateUtils.formatDate(lastWeekDay, "yyyy-MM-dd");
		// condition.gte("userId", "0");
		MongoDBManager mongoDBManager = new MongoDBManager("admin", "AnalysisUserInfo");
		AnalysisUserInfo analysisUserInfo = new AnalysisUserInfo();
		condition.notIs("action", "");
		condition.notIs("action", null);
		condition.gte("actionTime", lastWeekDayStr + " 00:00:00.000");
		condition.lte("actionTime", lastDayStr + " 23:59:59.000");
		Collection<AnalysisUserInfo> analysisUserInfos = mongoDBManager.find(condition, AnalysisUserInfo.class);
//		exportToExcel("G:/海风教育工作/BI统计/统计上课情况/(" + lastWeekDayStr + "-" + lastDayStr + ")用户登录注册数据汇总.xlsx", "BI学习中心用户统计", analysisUserInfos, analysisUserInfo);
	*/}

	// 用户访问活跃度统计
	@Test
	public void activityReport() throws Exception {
		// 用户活跃度统计
		Collection<UserInfo> analysisUserInfos = aggregateUserInfo();
		UserInfo userInfo = new UserInfo();
//		exportToExcel("G:/海风教育工作/BI统计/统计上课情况/用户访问活跃度统计.xlsx", "用户访问活跃度统计", analysisUserInfos, userInfo);
	}

	// 导出用户上课视频的使用情况
	@Test
	public void videoReport() throws Exception {
		MongoDBManager mongoDBManager = new MongoDBManager("admin", "RtcEvent");
		RtcEventDetail rtcEventDetail = new RtcEventDetail();
		Condition cond = Condition.init();
		Condition cond2 = Condition.init();
		Pattern pattern = Pattern.compile("^.*测试.*$|^.*顾问.*$", Pattern.CASE_INSENSITIVE);
		cond.like("userName", pattern.toString());
		cond2.not(cond);
		cond2.is("status", "2");
		Collection<RtcEventDetail> rtcEventDetails = mongoDBManager.find(cond2, RtcEventDetail.class);
//		exportToExcel("G:/海风教育工作/BI统计/统计上课情况/上课视频使用情况.xlsx", "上课视频使用情况", rtcEventDetails, rtcEventDetail);
	}

	/**
	 * TODO(aggregate分析用户信息)
	 * 
	 * @author: no_relax
	 * @Title: aggregateUserInfo void
	 * @since Vphone1.3.0
	 */
	@SuppressWarnings("deprecation")
	public static Collection<UserInfo> aggregateUserInfo() {
		DBCollection dbCollection = MongoDBServer.getDBCollection("admin", "AnalysisUserInfo");
		// $match
		DBObject match = new BasicDBObject("$match", new BasicDBObject("userType", "0"));
		// $group
		DBObject groupFields = new BasicDBObject();
		groupFields.put("_id", new BasicDBObject("phone", "$phone").append("userName", "$userName"));
		groupFields.put("count", new BasicDBObject("$sum", 1));
		DBObject group = new BasicDBObject("$group", groupFields);
		// $project
		DBObject fields = new BasicDBObject("phone", "$_id.phone");
		fields.put("userName", "$_id.userName");
		fields.put("_id", 0);
		fields.put("count", 1);
		DBObject project = new BasicDBObject("$project", fields);
		AggregationOutput output = dbCollection.aggregate(match, group, project);
		Iterator<DBObject> iterator = output.results().iterator();
		Collection<UserInfo> userInfos = new ArrayList<>();
		if (iterator.hasNext()) {
			while (iterator.hasNext()) {
				DBObject dBObject = (DBObject) iterator.next();
				UserInfo userInfo = new UserInfo();
				userInfo = BeanConverterUtils.docObject2Bean(dBObject, userInfo);
				userInfos.add(userInfo);

			}
			return userInfos;
		}
		return null;
	}

	// 老师回顾情况统计
	@Test
	public void exportReviewReport() throws Exception {
		MongoDBManager mongoDBManager = new MongoDBManager("admin", "RoomEvent");
		BasicDBObject condition = new BasicDBObject();// 条件
		condition.append("event", "进入");
		condition.append("status", "3");
		condition.append("userType", "1");
		condition.append("insertTime", new BasicDBObject("$gte", Long.valueOf("1483891200000")).append("$lte", Long.valueOf("1486569600000")));
		BasicDBObject key = new BasicDBObject("userId", 1);// 指定需要显示列
		key.append("roomId", 1);
		key.append("insertTime", 1);
		key.append("_id", 0);
		Collection<RoomEventDetail> roomEventDetails =null; /*mongoDBManager.find(condition, key, RoomEventDetail.class);*/
		RoomEventDetail roomEventDetail = new RoomEventDetail();
//		exportToExcel("G:/海风教育工作/BI统计/统计上课情况/上课回顾使用情况.xlsx", "上课回顾使用情况", roomEventDetails, roomEventDetail);

	}

	/**
	 * TODO(导出数据到excel方法)
	 * 
	 * @author: no_relax
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @Title: exportExcel
	 * @since Vphone1.3.0
	 */
	/*private static <T> void exportToExcel(String filePath, String titleName, Collection<?> objs, T bean) throws Exception {
		List<String> headerList = Lists.newArrayList();
		List<List<String>> dataList = Lists.newArrayList();
		Field[] fieldss = bean.getClass().getDeclaredFields();
		for (Field field : fieldss) {
			String name = field.getName();
			headerList.add(name);
		}
		for (Object t : objs) {
			Field[] fields = t.getClass().getDeclaredFields();
			List<String> dataRowList = Lists.newArrayList();
			for (Field field : fields) {
				field.setAccessible(true);
				dataRowList.add(StringUtil.isNotEmpty(field.get(t)) ? field.get(t).toString() : "");
			}
			dataList.add(dataRowList);
		}
		ExportExcel ee = new ExportExcel(titleName, headerList);

		for (int i = 0; i < dataList.size(); i++) {
			Row row = ee.addRow();
			for (int j = 0; j < dataList.get(i).size(); j++) {
				ee.addCell(row, j, dataList.get(i).get(j));
			}
		}

		ee.writeFile(filePath);

		ee.dispose();

		log.debug("Export success.");

	}*/

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			registerOrLoginReport();
			response.setContentType("text/html;charset=utf-8");
			response.setStatus(HttpServletResponse.SC_OK);
			baseRequest.setHandled(true);
			response.getWriter().print("导出数据成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new ExportAnalysisUserInfo());
		server.start();
		server.join();
	}

}
