package pattern.strategy.example1;


/**
 * Author li.ling
 * Description 商场打折的子类
 * Date 2021/6/18 18:08
 */
public class CashRebate extends CashSuper {

    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    protected double acceptCash(double money) {
        return money * rebate;
    }
}
