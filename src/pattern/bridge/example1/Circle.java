package pattern.bridge.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 9:38
 */
public class Circle extends Shape {


    @Override
    public void draw() {
        color.bePaint("圆形");
    }
}
