package pattern.flyweight.example1;

/**
 * Author li.ling
 * Description 享元类的超类或接口，通过这个接口可以接受并作用于外部状态
 * Date 2021/7/5 18:32
 */
public abstract class Flyweight {

    /**
     * @param extrinsicState 外部条件
     */
    public abstract void operation(int extrinsicState);
}
