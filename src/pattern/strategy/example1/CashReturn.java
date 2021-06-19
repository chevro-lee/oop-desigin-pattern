package pattern.strategy.example1;


/**
 * Author li.ling
 * Description 搞活动满减的子类
 * Date 2021/6/18 17:58
 */
public class CashReturn extends CashSuper {

    private double moneyCondition;

    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    protected double acceptCash(double money) {
        if (money > moneyCondition) {
            money = money - (Math.floor(money / moneyCondition) * moneyReturn);
        }
        return money;
    }
}
