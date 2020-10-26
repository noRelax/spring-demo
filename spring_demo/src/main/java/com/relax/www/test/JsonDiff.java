package com.relax.www.test;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

 
public class JsonDiff {
    public static void main(String[] args) {
         JSONObject json1 =  JSONObject.parseObject("{\"a\":\"a\",\"b\":\"b\",\"c\":\"c\"}");
         JSONObject json2 =  JSONObject.parseObject("{\"a\":\"a1sfsfsf\",\"b\":\"b\",\"c\":\"c\"}");
        compareJson(json1, json2,null);
      for (int i = 0; i < 10000; i++) {
         if (! json1.toString().equals( json1.toString())) {
            System.out.println(654565);
         }
        }
    }
    public static void compareJson(JSONObject json1, JSONObject json2,String key) {
        Set<String> i = json1.keySet();
        for (String string : i) {
            key =  string;
            compareJson(json1.get(key), json2.get(key),key);
        }  
    }
    public static void compareJson(Object json1,Object json2,String key) {
        if (  json1   instanceof   JSONObject ) {
            compareJson((JSONObject)  json1  ,(JSONObject)   json2,key);
        }else if (  json1   instanceof   JSONArray  ) {
            compareJson((JSONArray)  json1  ,(JSONArray)   json2,key);
        }else if(json1 instanceof String   ){
            compareJson((String)  json1  ,(String)   json2,key);
        }else {
            compareJson(json1.toString(), json2.toString(), key);
        }
    }
    public static void compareJson(String  str1,String str2,String key) {
        if (!str1.equals(str2)) {
            System.out.println("key:"+key+ ",json1:"+ str1 +",json2:"+str2);
        }
    }
    public static void compareJson(JSONArray json1,JSONArray json2,String key) {
        Iterator i1= json1.iterator();
        Iterator i2= json2.iterator();
        while ( i1.hasNext()) {
            compareJson(i1.next(), i2.next(),key);
        }
    }
    public static JSONObject getJson(String url) {
        try {
            URL url1 = new URL(url);
            InputStream in = url1.openStream();
            OutputStream out = new ByteArrayOutputStream();
            IOUtils.copy(in, out);
            String aa = out.toString();
            in.close();
            out.close();
            return JSONObject.parseObject(aa);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}