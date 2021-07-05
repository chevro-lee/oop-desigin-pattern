package pattern.mediator.example1;

/**
 * Author li.ling
 * Description 具体的抽象者类
 * Date 2021/7/5 11:03
 */
public class ConcreteMediator extends Mediator{

    // 中介者对象有所有同事的关联对象
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }


    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof ConcreteColleague1) {
            ((ConcreteColleague1) colleague).notify(message);
        } else if (colleague instanceof ConcreteColleague2) {
            ((ConcreteColleague2) colleague).notify(message);
        }
    }
}
