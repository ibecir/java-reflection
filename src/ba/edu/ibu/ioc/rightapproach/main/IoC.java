package ba.edu.ibu.ioc.rightapproach.main;

import ba.edu.ibu.ioc.rightapproach.db.MongoDatabase;
import ba.edu.ibu.ioc.rightapproach.business.User;
import ba.edu.ibu.ioc.rightapproach.db.OracleDatabase;

public class IoC {
    /*
    * 1. Hard to test this as the User class internally relies on the MongoDatabase class instance
    *    as we cannot pass the mock instance of the MongoDatabase class
    * 2. We cannot connect to some other database, because we hardcoded the MongoDatabase class
    *    in the User constructor
    *
    * What we want is to invert a control flow, so we do not mess with the lifecycle and creation
    * of the objects we need. Somebody else should do this for me.
    * */
    public static void main(String[] args) {
        MongoDatabase mongoDatabase = new MongoDatabase();
        OracleDatabase oracleDatabase = new OracleDatabase();
        User user = new User(mongoDatabase); // We should be able to say -> User user = new User(oracleDatabase);
        user.add("DUMMY DATA");
    }
}
