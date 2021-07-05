package pattern.mediator.example1;

/**
 * Author li.ling
 * Description 具体的同事类
 * Date 2021/7/5 11:03
 */
public class ConcreteColleague1 extends Colleague {


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        mediator.send(msg, this);
    }

    public void notify(String msg) {
        System.out.println("同事1得到消息，" + msg);
    }
}
