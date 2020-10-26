package com.relax.www.aliyunMonitor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.UUID;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class EcsTemplate {
	private final static String SIGNATURE_VERSION = "1.0";
	private final static String defaultSignatureType = "HMAC-SHA1";
	private final static String API_Format = "JSON";
	// cms version
	private final static String API_VERSION = "2015-10-20";
	// 输入你的AK信息
	private final static String accessKeyId = "LTAIydl2zczmcud9";
	private final static String accessKeySecret = "DX9Sqc1LQlZBbsL3pYFuWKA2mEizyP";
	private final static String domainnew = "metrics.aliyuncs.com";

	// protected String domain = "alert.aliyuncs.com";
	private static String formatISO8601Date(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
		df.setTimeZone(new SimpleTimeZone(0, "GMT"));
		return df.format(date);
	}

	protected HttpHeaders buildHttpHeaders(String sessionId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authentication", sessionId);
		return headers;
	}

	public static void main(String[] args) {
		Map<String, String> parameters = new HashMap<String, String>();
		// String action = "DescribeInstances";
		String action = "QueryMetricList";
		parameters.put("RegionId", "cn-hangzhou");
		parameters.put("Action", action);
		parameters.put("Project", "acs_kvstore");
		parameters.put("Metric", "CpuUsage");
		parameters.put("StartTime", "2017-02-01 00:00:00");
		parameters.put("Period", "60");
		parameters.put("Length", "1000");
		// 注意dimension格式！！
		parameters.put("Dimensions", "{'instanceId':'1ff98b675b2c466b'}");
		parameters.put("AccessKeyId", accessKeyId);
		parameters.put("Format", API_Format);
		parameters.put("SignatureMethod", defaultSignatureType);
		parameters.put("SignatureNonce", UUID.randomUUID().toString());
		parameters.put("SignatureVersion", SIGNATURE_VERSION);
		parameters.put("Version", API_VERSION);
		parameters.put("Timestamp", formatISO8601Date(new Date()));
		String url = "http://" + domainnew;
		if (!url.endsWith("/")) {
			url += "/";
		}
		url += "?";
		url += UrlUtil.generateQueryString(parameters, true);
		String signature = null;
		try {
			signature = SignatureUtils.generate("GET", parameters, accessKeySecret);
		} catch (Exception e) {
			e.printStackTrace();
		}
		url += "&Signature=" + signature;
		HttpMethod http1 = new PostMethod();
		HttpMethod httpMethod = new GetMethod(url);
		System.out.println(url);
		HttpClient httpClient = new HttpClient(new MultiThreadedHttpConnectionManager());
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(6000);// 设置请求超时时间6秒
		httpClient.getHttpConnectionManager().getParams().setSoTimeout(30000); // 设置读取超时时间
		try {
			int statusCode = httpClient.executeMethod(httpMethod);
			// if(statusCode!=200)return null;
			byte[] bytes = httpMethod.getResponseBody();
			String result = "[" + statusCode + "]" + new String(bytes, "UTF-8");
			System.out.println(result);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}