package pattern.factory.method.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 17:23
 */
public class AddFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
