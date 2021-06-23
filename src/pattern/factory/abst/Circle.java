package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 11:44
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆");
    }
}
