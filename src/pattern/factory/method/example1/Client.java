package pattern.factory.method.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 17:27
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumA(3);
        operation.setNumB(5);
        System.out.println(operation.getResult());
    }
}
