package pattern.factory.method.example1;


/**
 * Author li.ling
 * Description
 * Date 2021/6/18 15:46
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() - super.getNumB();
    }
}
