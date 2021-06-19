package pattern.factory.simple.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/18 18:21
 */
public class Client {

    public static void main(String[] args) {
        CashSuper cashAccepter = CashFactory.cashAccepter("8折");
        double cash = cashAccepter.acceptCash(500);
        System.out.println(cash);
    }
}
