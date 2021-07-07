package pattern.flyweight.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/7/5 19:31
 */
public class Client {

    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight x = factory.getFlyweight("X");
        x.operation(--extrinsicState);
        Flyweight y = factory.getFlyweight("Y");
        y.operation(--extrinsicState);
        Flyweight z = factory.getFlyweight("Z");
        z.operation(--extrinsicState);
        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);
    }
}
