package pattern.responsibility.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 16:18
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        // 设置职责链
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        int[] requests = new int[]{2, 15, 6, 13, 24};
        for (int request : requests) {
            handler1.handleRequest(request);
        }
    }
}
