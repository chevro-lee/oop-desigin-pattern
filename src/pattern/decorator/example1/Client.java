package pattern.decorator.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 14:14
 */
public class Client {

    public static void main(String[] args) {
        Person p = new Person("小菜");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        // 装饰过程
        tShirts.decorate(p);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
