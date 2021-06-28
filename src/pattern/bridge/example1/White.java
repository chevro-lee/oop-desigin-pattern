package pattern.bridge.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 9:41
 */
public class White extends Color {

    @Override
    public void bePaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
