package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.operation.OrderBy;

/**
 * Java + MongoDB Hello world Example
 * 
 */
public class App {

	private void connectPROD() throws UnknownHostException {

		Block<Document> printBlock = new Block<Document>() {
			@Override
			public void apply(final Document document) {
				System.out.println(document.toJson());
				System.out.println("*******************************************************************");
				System.out.println("***************");
				System.out.println("*******************************************************************");
			}
		};

		// PROD

		MongoCredential credential = MongoCredential.createCredential("egisprod_rw", "admin", "pEppUr-^ke3+".toCharArray());
		MongoClient mongoClient = new MongoClient(new ServerAddress("10.122.80.232", 27017), Arrays.asList(credential));
		MongoDatabase db = mongoClient.getDatabase("egis_prd");

		// DEV env
//		MongoCredential credential = MongoCredential.createCredential("egisint_rw", "admin", "RosE-7A^2".toCharArray());
//		MongoClient mongoClient = new MongoClient(new ServerAddress("10.124.42.180", 27017), Arrays.asList(credential));

		// Local
//		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
//		System.out.println(mongoClient.getDatabaseNames());
//		MongoDatabase db = mongoClient.getDatabase("development");

		MongoCollection<Document> table = db.getCollection("DRIVE_METADATA");

//			System.out.println(table.find());
		BasicDBObject searchQuery = new BasicDBObject();
//		searchQuery.put("ASSET_ID", 1050);
		searchQuery.put("LAST", true);
		searchQuery.put("DELETE_DATE", new BasicDBObject("$exists", false));
		searchQuery.put("LAST_UPDATE_DATE", new BasicDBObject("$gte", "2019-06-24T09:00:02"));
		searchQuery.put("LAST_UPDATE_DATE", new BasicDBObject("$lt", "2019-06-24T12:00:02"));

		BasicDBObject fieldQuery = new BasicDBObject();
		fieldQuery.put("ES_IN_SYNC", false);
		fieldQuery.put("LAST", false);

		System.out.println(System.currentTimeMillis());
//		System.out.println(table.count(searchQuery));
		
		
		FindIterable<Document> docs = table.find(searchQuery).projection(new Document("ES_IN_SYNC", false).append("LAST", false))
				.sort(new BasicDBObject("_id", OrderBy.ASC.getIntRepresentation())).skip(0).limit(200);
//				.forEach(printBlock);
		
//		System.out.println(docs.l);
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(Document doc : docs) {
			System.out.println(""+doc.getLong("ASSET_ID"));
		}
		long diff = System.currentTimeMillis() - start;
		System.out.println(diff);
		/*
		 * } System.out.println("Auth failed.....");
		 */
	}

	public static void main(String[] args) {

		try {

			new App().connectPROD();
//			
			/**** Connect to MongoDB ****/
			/*
			 * // Since 2.10.0, uses MongoClient MongoClient mongo = new
			 * MongoClient("localhost", 27017);
			 * 
			 *//**** Get database ****/
			/*
			 * // if database doesn't exists, MongoDB will create it for you DB db =
			 * mongo.getDB("testdb");
			 * 
			 *//**** Get collection / table from 'testdb' ****/
			/*
			 * // if collection doesn't exists, MongoDB will create it for you DBCollection
			 * table = db.getCollection("user");
			 * 
			 *//**** Insert ****/
			/*
			 * // create a document to store key and value BasicDBObject document = new
			 * BasicDBObject(); document.put("name", "mkyong"); document.put("age", 30);
			 * document.put("createdDate", new Date()); table.insert(document);
			 * 
			 *//**** Find and display ****/
			/*
			 * BasicDBObject searchQuery = new BasicDBObject(); searchQuery.put("name",
			 * "mkyong");
			 * 
			 * DBCursor cursor = table.find(searchQuery);
			 * 
			 * while (cursor.hasNext()) { System.out.println(cursor.next()); }
			 * 
			 *//**** Update ****/
			/*
			 * // search document where name="mkyong" and update it with new values
			 * BasicDBObject query = new BasicDBObject(); query.put("name", "mkyong");
			 * 
			 * BasicDBObject newDocument = new BasicDBObject(); newDocument.put("name",
			 * "mkyong-updated");
			 * 
			 * BasicDBObject updateObj = new BasicDBObject(); updateObj.put("$set",
			 * newDocument);
			 * 
			 * table.update(query, updateObj);
			 * 
			 *//**** Find and display ****/
			/*
			 * BasicDBObject searchQuery2 = new BasicDBObject().append("name",
			 * "mkyong-updated");
			 * 
			 * DBCursor cursor2 = table.find(searchQuery2);
			 * 
			 * while (cursor2.hasNext()) { System.out.println(cursor2.next()); }
			 * 
			 *//**** Done ****//*
								 * System.out.println("Done");
								 */

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

	}
}
