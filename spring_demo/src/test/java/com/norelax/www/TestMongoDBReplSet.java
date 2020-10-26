package com.norelax.www;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class TestMongoDBReplSet {
	public static void main(String[] args) {
		try {
			List<ServerAddress> addresses = new ArrayList<ServerAddress>();
			ServerAddress address1 = new ServerAddress("192.168.54.250", 1111);
			ServerAddress address2 = new ServerAddress("192.168.54.250", 2222);
			ServerAddress address3 = new ServerAddress("192.168.54.250", 3333);
			addresses.add(address1);
			addresses.add(address2);
			addresses.add(address3);
			MongoClient client = new MongoClient(addresses);
			DB db = client.getDB("test");
			DBCollection coll = db.getCollection("test"); // 插入 BasicDBObject
			for (int i = 0; i < 10; i++) {
				BasicDBObject object = new BasicDBObject("name", "wusong"+i);
				coll.insert(object);
			}
			DBCursor dbCursor = coll.find();
			while (dbCursor.hasNext()) {
				DBObject dbObject = dbCursor.next();
				System.out.println(dbObject.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}