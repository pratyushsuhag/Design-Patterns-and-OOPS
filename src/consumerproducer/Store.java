package consumerproducer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    //max size of the counters on which producer can put their items
    private int maxSize;
    //new array if new store is created
    private ConcurrentLinkedDeque<Object>items;

    Store(int maxSize)
    {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }
    public int getMaxSize()
    {
        return maxSize;
    }
    public ConcurrentLinkedDeque<Object> getItem()
    {
        return items;
    }
    public void addItem()
    {
        System.out.println("producer production time,item size "+this.items.size());
        this.items.add(new Object());
    }

    public void removeItem()
    {
        System.out.println("consumer consuming time,current size "+this.items.size());
        this.items.remove();
    }
}
