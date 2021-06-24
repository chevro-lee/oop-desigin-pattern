package pattern.adapter.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/24 10:02
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
