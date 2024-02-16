package org.example;

import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.model.Filters;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.Map;
// Include the following static imports before your class definition
import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class QuickStart {
    String uri = "mongodb+srv://kishanthan:486426%40Sk5@cluster0.nvw26ui.mongodb.net/?retryWrites=true&w=majority";
    CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
    CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));


    public void initial_setup() {

    }

    public void connect(Car car) {
        // Replace the placeholder with your MongoDB deployment's connection string
        try(MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("sample_pojos").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Car> collection = database.getCollection("Car", Car.class);
            collection.insertOne(car);

        } catch (Exception e) {
            System.out.println(e);
        }


    }


    public void deletecar(int num) {

        try (MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("sample_pojos").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Car> collection = database.getCollection("Car", Car.class);
            collection.deleteOne(Filters.eq("unique_number", num));
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
