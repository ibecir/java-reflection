package ba.edu.ibu.ioc.rightapproach.db;

/*
* Database layer
* */
public class MongoDatabase {
    public void persist(String data){
        System.out.println("Mongo has persisted: " + data);
    }
}
