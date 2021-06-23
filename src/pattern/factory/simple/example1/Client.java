package pattern.factory.simple.example1;

/**
 * Author li.ling
 * Description 简单工厂模式 - 客户端类
 * Date 2021/6/18 15:57
 */
public class Client {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumA(3.0);
        operation.setNumB(5.0);
        System.out.println(operation.getResult());

        Operation operation1 = OperationFactory.createOperation("pattern.factory.simple.example1.OperationDiv",
                OperationDiv.class);
        operation1.setNumA(15);
        operation1.setNumB(3);
        System.out.println(operation1.getResult());
    }
}
