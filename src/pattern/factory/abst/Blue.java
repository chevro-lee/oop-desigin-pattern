package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 11:53
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("填充了蓝色");
    }
}
