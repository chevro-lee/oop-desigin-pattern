package pattern.factory.simple.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/18 15:48
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() / super.getNumB();
    }
}
