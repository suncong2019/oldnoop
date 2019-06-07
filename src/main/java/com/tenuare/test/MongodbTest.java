package com.tenuare.test;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by X230 on 2019/5/27.
 */
public class MongodbTest {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase spitdb = client.getDatabase("spitdb");
        MongoCollection<Document> spit = spitdb.getCollection("spit");
        //BasicDBObject base = new BasicDBObject("userid","1013");
        //BasicDBObject base = new BasicDBObject("visits",new BasicDBObject("$gt",1000));
        /*FindIterable<Document> list = spit.find();
        for (Document d : list){
            System.out.println("内容："+d.getString("content"));
            System.out.println("用户ID："+d.getString("userid"));
            System.out.println("昵称："+d.getString("nickname"));
            System.out.println("访问数："+d.getInteger("visits"));
        }*/

        //添加
        /*Map<String,Object> map = new HashMap<>();
        map.put("_id","5");
        map.put("content","十年生死两茫茫");
        map.put("userid","0116");
        map.put("nickname","苏子瞻");
        map.put("visits",20000);
        Document document = new Document(map);
        spit.insertOne(document);*/

        //删除
       /* BasicDBObject bson = new BasicDBObject("userid","0116");
        spit.deleteOne(bson);*/

        //修改


        client.close();

    }
}
