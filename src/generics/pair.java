package generics;

public class pair <V,S> {
    private V first;
    private S second;

    public pair(V first , S second)
    {
        this.first = first;
        this.second = second;
    }
    public V getFirst()
    {
        return first;
    }
    public S getSecond()
    {
        return second;
    }
}
