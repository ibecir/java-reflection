package ba.edu.ibu.ioc.wrongapproach;

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
        IoC container = new IoC();
        User user = new User();
        user.add("DUMMY DATA");
    }
}
