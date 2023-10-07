package ba.edu.ibu.ioc.rightapproach.impl;

import ba.edu.ibu.ioc.rightapproach.abstraction.Database;

public class OracleDatabaseImpl implements Database {
    public void persist(String data){
        System.out.println("Oracle has persisted: " + data);
    }
}
