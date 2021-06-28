package pattern.bridge.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 9:40
 */
public class Square extends Shape {

    @Override
    public void draw() {
        color.bePaint("正方形");
    }
}
