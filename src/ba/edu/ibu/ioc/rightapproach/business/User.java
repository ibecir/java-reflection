package ba.edu.ibu.ioc.rightapproach.business;

import ba.edu.ibu.ioc.rightapproach.db.MongoDatabase;

/*
* Business logic layer
* */
public class User {
    MongoDatabase database;

    // Now, when we pass the database object as a parameter we can easily test this program
    // But what if customer says, I want to use Oracle database instead of Mongo
    public User(MongoDatabase database){
        this.database = database;
    }

    public void add(String data){
        database.persist(data);
    }
}
