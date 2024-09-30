package consumerproducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


public class client {
     public static void main(String[] args) {
         ExecutorService ex = Executors.newCachedThreadPool();
         Semaphore producerSema = new Semaphore(5);
         Semaphore consumerSema = new Semaphore(0);
         Store store = new Store(5);
         for(int i=1;i<=8;i++)
         {
             ex.execute(new producer(store,producerSema,consumerSema));
         }
         for(int i=1;i<=20;i++)
         {
             ex.execute(new consumer(store,consumerSema,consumerSema));
         }
    }
}
