package pattern.factory.simple.example2;

/**
 * Author li.ling
 * Description 简单工厂模式 - 搞活动满减的子类
 * Date 2021/6/18 17:58
 */
public class CashReturn extends CashSuper{

    private double moneyCondition;

    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    protected double acceptCash(double money) {
        if (money > moneyCondition) {
            money = money - (money / moneyCondition * moneyReturn);
        }
        return money;
    }
}
