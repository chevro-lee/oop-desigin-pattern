package pattern.responsibility.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 16:15
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandler3处理请求");
        } else {
            // 不在0-10区间内就转到下一个处理请求的指责类
            successor.handleRequest(request);
        }
    }
}
