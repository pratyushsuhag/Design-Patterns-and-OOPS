package consumerproducer;

import java.util.concurrent.Semaphore;

public class producer implements Runnable {
    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    producer(Store st,Semaphore producerSema,Semaphore consumerSema)
    {
        this.store=st;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }
    public void run()
    {
        while(true)
        {
            try {
                producerSema.acquire();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            store.addItem();

            consumerSema.release();
        }
    }
}
