package ba.edu.ibu.ioc.wrongapproach;

public class User {
    MongoDatabase database;

    public User(){
        database = new MongoDatabase();
    }

    public void add(String data){
        database.persist(data);
    }
}
