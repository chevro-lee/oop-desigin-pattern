package pattern.proxy.example1;

/**
 * Author li.ling
 * Description 客户端
 * Date 2021/6/20 16:35
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("娇娇");
        Proxy proxy = new Proxy(girl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
