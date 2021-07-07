package pattern.flyweight.example1;

import java.util.Hashtable;

/**
 * Author li.ling
 * Description
 * Date 2021/7/5 19:27
 */
public class FlyweightFactory {

    private Hashtable<String, Flyweight> hashtable = new Hashtable<>();

    public FlyweightFactory() {
        hashtable.put("X", new ConcreteFlyweight());
        hashtable.put("Y", new ConcreteFlyweight());
        hashtable.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return hashtable.get(key);
    }
}
