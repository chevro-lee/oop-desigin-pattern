package pattern.decorator.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 14:05
 */
public class TShirts extends Finery {


    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}
