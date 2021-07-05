package pattern.mediator.example1;

/**
 * Author li.ling
 * Description 抽象的同事类
 * Date 2021/7/5 10:55
 */
public abstract class Colleague {

    protected Mediator mediator;

    // 构造方法，得到中介者对象
    public Colleague (Mediator mediator) {
        this.mediator = mediator;
    }
}
