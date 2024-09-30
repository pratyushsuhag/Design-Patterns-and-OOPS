package singleton;

import static java.util.Currency.getInstance;

public class client  {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println("hello");
        //again 2 instance are created
//        Thread t1 = new Thread(db1);
//        t1.start();
//        Thread t2 = new Thread(db1);
//        t2.start();
//        public void run()
//        {
//            System.out.println("threat is running");
//        }

    }
}
