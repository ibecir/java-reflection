package ba.edu.ibu.ioc.rightapproach.business;

import ba.edu.ibu.ioc.rightapproach.abstraction.Database;

/*
 * Business logic layer
 * */
public class UserIoc {
    Database database;

    // Now we have the interface here that can be anything that implements that interface
    public UserIoc(Database database){
        this.database = database;
    }

    public void add(String data){
        database.persist(data);
    }
}

