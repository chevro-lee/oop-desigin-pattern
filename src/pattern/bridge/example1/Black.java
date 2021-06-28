package pattern.bridge.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 9:41
 */
public class Black extends Color {

    @Override
    public void bePaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
