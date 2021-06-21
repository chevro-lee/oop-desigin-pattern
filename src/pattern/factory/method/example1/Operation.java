package pattern.factory.method.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 17:21
 */
public abstract class Operation {

    private double numA;

    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getResult() {
        return 0;
    }
}
