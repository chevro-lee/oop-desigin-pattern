package pattern.strategy.example1;



/**
 * Author li.ling
 * Description 不打折的子类
 * Date 2021/6/18 18:07
 */
public class CashNormal extends CashSuper {

    @Override
    protected double acceptCash(double money) {
        return money;
    }
}
