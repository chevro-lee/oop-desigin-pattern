package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 11:45
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个长方形");
    }
}
