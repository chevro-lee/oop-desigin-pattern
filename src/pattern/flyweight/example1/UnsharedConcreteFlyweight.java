package pattern.flyweight.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/7/5 19:20
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体的flyweight" + extrinsicState);
    }
}
