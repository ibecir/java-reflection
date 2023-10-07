package ba.edu.ibu.ioc.rightapproach.main;

import ba.edu.ibu.ioc.rightapproach.business.User;
import ba.edu.ibu.ioc.rightapproach.business.UserIoc;
import ba.edu.ibu.ioc.rightapproach.db.MongoDatabase;
import ba.edu.ibu.ioc.rightapproach.db.OracleDatabase;
import ba.edu.ibu.ioc.rightapproach.impl.MongoDatabaseImpl;
import ba.edu.ibu.ioc.rightapproach.impl.OracleDatabaseImpl;

public class IoCImpl {
    /*
    * Now the User method becomes more generic
    * We get the loosely coupled reliance upon database dependencies
    * We have here, Dependency Injection, passing them down the control graph,
    * rather than having black box implementation previously mentioned not knowing
    * which one was used in the particular case.
    *
    * Spring creates global instance of the object called Bean
    * @Autowire
     */
    public static void main(String[] args) {
        MongoDatabaseImpl mongoDatabase = new MongoDatabaseImpl();
        OracleDatabaseImpl oracleDatabase = new OracleDatabaseImpl();
        UserIoc user = new UserIoc(mongoDatabase);
        user.add("DUMMY DATA mongo");

        UserIoc user2 = new UserIoc(oracleDatabase);
        user.add("DUMMY DATA oracle");
    }
}
