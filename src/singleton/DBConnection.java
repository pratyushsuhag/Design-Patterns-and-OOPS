package singleton;

import java.io.PrintWriter;

public class DBConnection implements Runnable {
    private static volatile DBConnection dbc = null;

    String url;
    String username;
    String password;
    int portNo;
    //idea 1 - making constructor private but
    // then we can't create even 1 instance
    // but we can create instance within the class ,
    // so we can expose a public method ;
    private DBConnection ()
        {

        }
        public void run()
        {
            System.out.println(Thread.currentThread().getName() + "is running");
        }
        //again 2 instances are created
    // for multi threaded this will not work as when 2 thread parallely access the getInstance then 2 instnce will be made
//        public static DBConnection getInstance()
//        {
//            if(dbc==null) {
//                System.out.println("dbc is null and instance is created");
//                System.out.println(Thread.currentThread().getName());
//                return dbc =  new DBConnection();
//
//            }
//            System.out.println("dbc is not null ");
//            System.out.println((Thread.currentThread().getName()));
//            return dbc;

    //we can make this syncronised then only one thread can access this sequentially
//        public static synchronized DBConnection getInstance()
//        {
//            if(dbc==null) {
//                System.out.println("dbc is null and instance is created");
//                System.out.println(Thread.currentThread().getName());
//                return dbc =  new DBConnection();
//
//            }
//            System.out.println("dbc is not null ");
//            System.out.println((Thread.currentThread().getName()));
//            return dbc;
//        }
    //this can be done without the use syncronized keyword with the help of eager loading but it can delay/increase the startup time of application
    //if some parameters are required then we can't pass them
//    public static DBConnection getInstance()
//    {
//        return dbc;
//    }


    // as syncronized it at the staring then in case ig there are 100 threads then all of them had to execute sequentially and it will slow down the process
    // at first we want only the making of thread to be syncronized then all will aceess the same instance

    public static DBConnection getInstance()
    {
        if(dbc==null) {
            synchronized (DBConnection.class) {
                if(dbc==null) {
                    System.out.println("dbc is null and instance is created");
                    System.out.println(Thread.currentThread().getName());
                    return dbc = new DBConnection();
                }
            }

        }
        System.out.println("dbc is not null ");
        System.out.println((Thread.currentThread().getName()));
        return dbc;
    }

}
