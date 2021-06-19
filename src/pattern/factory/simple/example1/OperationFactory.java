package pattern.factory.simple.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/18 15:51
 */
public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation operate;
        switch (operation) {
            case "+":
                operate = new OperationAdd();
                break;
            case "-":
                operate = new OperationSub();
                break;
            case "*":
                operate = new OperationMul();
                break;
            case "/":
                operate = new OperationDiv();
                break;
            default:
                operate = null;
                break;
        }
        return operate;
    }
}
