package ba.edu.ibu.ioc.rightapproach.impl;

import ba.edu.ibu.ioc.rightapproach.abstraction.Database;

/*
* Database layer
* */
public class MongoDatabaseImpl implements Database {
    public void persist(String data){
        System.out.println("Mongo has persisted: " + data);
    }
}
