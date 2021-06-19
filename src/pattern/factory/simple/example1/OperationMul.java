package pattern.factory.simple.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/18 15:47
 */
public class OperationMul extends Operation{

    @Override
    public double getResult() {
        return super.getNumA() * super.getNumB();
    }
}
