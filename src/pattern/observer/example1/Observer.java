package pattern.observer.example1;

/**
 * Author li.ling
 * Description 观察者抽象
 * Date 2021/6/22 17:34
 */
public abstract class Observer {

    protected Subject subject;

    protected String name;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    // 接收观察者通知
    public abstract void update();
}
