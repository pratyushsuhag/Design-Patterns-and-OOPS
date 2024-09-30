package consumerproducer;

import java.util.concurrent.Semaphore;

public class consumer implements Runnable{
    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    consumer(Store st,Semaphore producerSema,Semaphore consumerSema)
    {
        this.store=st;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                consumerSema.acquire();
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }

                    store.removeItem();
            producerSema.release();

        }
    }
}
