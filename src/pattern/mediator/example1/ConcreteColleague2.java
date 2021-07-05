package pattern.mediator.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/7/5 11:07
 */
public class ConcreteColleague2 extends Colleague {


    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        mediator.send(msg, this);
    }

    public void notify(String msg) {
        System.out.println("同事2得到了消息，" + msg);
    }
}
