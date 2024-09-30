package producerconsumersemaphore;
import java.util.ArrayList;
import java.util.List;

public class Store {
    //max size of the counters on which producer can put their items
    private int maxSize;
    //new array if new store is created
    private List<Object>items;

    Store(int maxSize)
    {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
    public int getMaxSize()
    {
        return maxSize;
    }
    public List<Object> getItem()
    {
        return items;
    }
    public void addItem()
    {
        System.out.println("producer procution time,item size"+this.items.size());
        this.items.add(new Object());
    }

    public void removeItem()
    {
        System.out.println("consumer consuming time,current size"+this.items.size());
        this.items.remove(this.items.size()-1);
    }
}
