package pattern.decorator.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 14:12
 */
public class BigTrouser extends Finery {


    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

