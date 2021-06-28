package pattern.command.example1;

/**
 * Author li.ling
 * Description 具体执行者类
 * Date 2021/6/28 10:21
 */
public class Barbecuer implements IBarbecuer {

    @Override
    public void kebab() {
        System.out.println("烤羊肉串");
    }

    @Override
    public void chicken() {
        System.out.println("烤鸡肉");
    }

    @Override
    public void ham() {
        System.out.println("烤火腿");
    }
}
