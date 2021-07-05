package pattern.mediator.example1;

/**
 * Author li.ling
 * Description 抽象中介者类
 * Date 2021/7/5 10:53
 */
public abstract class Mediator {

    /**
     * 定义一个抽象的发送消息的方法，得到同事对象和发送消息
     *
     * @param message
     * @param colleague
     */
    public abstract void send(String message, Colleague colleague);
}
