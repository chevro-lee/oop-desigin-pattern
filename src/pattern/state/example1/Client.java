package pattern.state.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 17:11
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        System.out.println("当前状态："+context.getState());
        context.request();
        System.out.println("当前状态："+context.getState());
        context.request();
        System.out.println("当前状态："+context.getState());
        context.request();
    }
}
