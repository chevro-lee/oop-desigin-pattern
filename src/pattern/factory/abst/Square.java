package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 11:46
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个正方形");
    }
}
