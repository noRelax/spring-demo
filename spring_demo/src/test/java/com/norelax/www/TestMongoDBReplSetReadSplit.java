package com.norelax.www;
import java.util.ArrayList;
import java.util.List;

import com.hfjy.base.db.mongodb.util.HttpUtils;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;

public class TestMongoDBReplSetReadSplit {

        public static void main(String[] args) {
               try {
                     List<ServerAddress> addresses = new ArrayList<ServerAddress>();
                     ServerAddress address1 = new ServerAddress("192.168.54.250" , 1111);
                     ServerAddress address2 = new ServerAddress("192.168.54.250" , 2222);
                     ServerAddress address3 = new ServerAddress("192.168.54.250" , 3333);
                     addresses.add(address1);
                     addresses.add(address2);
                     addresses.add(address3);

                     MongoClient client = new MongoClient(addresses);
                     DB db = client.getDB( "test" );
                     DBCollection coll = db.getCollection( "test" );


                     BasicDBObject object = new BasicDBObject();
                     object.append( "name" , "wusong" );

                      //读操作从副本节点读取
                     ReadPreference preference = ReadPreference.secondary();
                     DBObject dbObject = coll.findOne(object, null , preference);

                     System. out .println(dbObject);


              } catch (Exception e) {
                     e.printStackTrace();
              }
       }
}
