package pattern.flyweight.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/7/5 18:41
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("共享的Flyweight" + extrinsicState);
    }
}
