package com.relax.www.aliyunMonitor;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cms.model.QueryMetricListRequest;
import com.aliyuncs.cms.model.QueryMetricListResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.hfjy.base.util.DateUtils;
import com.hfjy.base.util.StringUtil;

public class Snippet {
	IAcsClient client = null;

	@Before
	public void init() throws ClientException {
		// 测试
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIydl2zczmcud9", "DX9Sqc1LQlZBbsL3pYFuWKA2mEizyP");
		client = new DefaultAcsClient(profile);
	}

	@SuppressWarnings("all")
	protected <T extends RpcAcsRequest, K extends AcsResponse> K execute(T request) {
		try {
			// todo something.
			request.setContentType(FormatType.JSON);
			request.setAcceptFormat(FormatType.JSON);
			doAction(request);
			AcsResponse response = client.getAcsResponse(request);
			return (K) response;
		} catch (ClientException e) {
			// todo something.
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("all")
	protected <T extends RpcAcsRequest> void doAction(T request) {
		try {
			// todo something.
			HttpResponse response = client.doAction(request);
			// System.out.println("response url:\t\t" + response.getUrl());
			// System.out.println("Response Content: \n\t\t" + new
			// String(response.getContent(), "UTF-8"));
		} catch (ClientException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void queryMetric() {
		QueryMetricListRequest request = new QueryMetricListRequest();
		request.setProject("acs_kvstore");
		request.setMetric("IntranetOut");
		request.setPeriod("60");
		request.setDimensions("{instanceId:'1ff98b675b2c466b'}");
		request.setLength("1000");
		// 设置游标,可用于分页查询
		// request.setCursor("1467963900000003d16b31e22329672d3e101a55d2caa31303030323432383030353930393834242c692d393435667539376633242c");
		// SimpleDateFormat format = new
		// SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		// Calendar cal = Calendar.getInstance();
		// cal.add(Calendar.DAY_OF_MONTH, -10);
		// cal.add(Calendar.HOUR_OF_DAY, -8);
		// // String endTime = format.format(cal.getTime());
		// cal.add(Calendar.MINUTE, -10);
		// String startTime = format.format(cal.getTime());
		// request.setStartTime(startTime);
		String startTime = "2017-01-15 00:00:00";
		boolean flag = true;
		while (flag) {
			request.setStartTime(startTime);
			QueryMetricListResponse response = execute(request);
			List<JSONObject> datapoints = response.getDatapoints();
			for (JSONObject objJson : datapoints) {
				System.out.println(JSON.toJSONString(objJson, true));
			}
			String cursor = response.getCursor();
			if (StringUtil.isNotEmpty(cursor)) {
				flag = true;
				Long lastTimestamp = datapoints.get(datapoints.size() - 1).getLong("timestamp");
				Date date = new Date(lastTimestamp);
				startTime = DateUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss");
			} else {
				flag = false;
			}
		}

	}

	@Test
	public void test() {
		Date date = new Date(1486961040000L);
		String startTime = DateUtils.formatDate(date, "yyyy-MM-dd'T'HH:mm:ss'Z'");
		System.out.println(startTime);
	}
}