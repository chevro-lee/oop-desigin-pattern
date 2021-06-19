package pattern.strategy.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/19 10:25
 */
public class Client {

    public static void main(String[] args) {
        CashContext context = new CashContext("满300减30");
        double result = context.getResult(700);
        System.out.println(result);
    }
}
