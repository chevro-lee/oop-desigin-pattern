package pattern.strategy.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/19 9:59
 */
public class CashContext {

    private CashSuper cashSuper;

    // 策略模式内嵌一个简单工厂模式
    public CashContext (String type) {
        switch (type) {
            case "不打折":
                cashSuper = new CashNormal();
                break;
            case "满300减30":
                cashSuper = new CashReturn(300,30);
                break;
            case "8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult (double money) {
        return this.cashSuper.acceptCash(money);
    }
}
