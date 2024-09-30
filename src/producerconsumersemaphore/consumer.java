package producerconsumersemaphore;

public class consumer implements Runnable{
    private Store store;

    consumer(Store st)
    {
        this.store=st;
    }
    public void run()
    {
        while(true)
        {
            synchronized (store)
            {
                if(store.getItem().size()>0)
                {
                    store.removeItem();
                }
            }
        }
    }
}
