package producerconsumersemaphore;

public class producer implements Runnable {
    private Store store;

    producer(Store st)
    {
        this.store=st;
    }
    public void run()
    {
        while(true)
        {
            synchronized (store)
            {
            if(store.getItem().size()<store.getMaxSize())
            {
                store.addItem();
            }
            }
        }
    }
}
