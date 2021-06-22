package pattern.facade.example1;

/**
 * Author li.ling
 * Description 外观模式客户端
 * Date 2021/6/22 11:27
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
