package pattern.mediator.example1;

/**
 * Author li.ling
 * Description 中介者模式
 * Date 2021/7/5 11:20
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        // 让两个同事取得中介者的联系方式
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        // 中介者需要知道两个同事的联系方式
        m.setConcreteColleague1(c1);
        m.setConcreteColleague2(c2);
        // 通过中介者发送消息
        c1.send("帮我问问他吃饭不？");
        c2.send("帮我回他，如果他请客，我就吃");
    }
}
