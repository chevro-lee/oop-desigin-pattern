package pattern.factory.simple.example2;

/**
 * Author li.ling
 * Description 现金收取类型生产工厂类
 * Date 2021/6/18 18:14
 */
public class CashFactory {

    public static CashSuper cashAccepter(String type) {
        CashSuper cashAccepter ;
        switch (type) {
            case "不打折":
                cashAccepter = new CashNormal();
                break;
            case "满300减30":
                cashAccepter = new CashReturn(300, 30);
                break;
            case "8折":
                cashAccepter = new CashRebate(0.8);
                break;
            default:
                cashAccepter = null;
                break;
        }
        return cashAccepter;
    }
}
