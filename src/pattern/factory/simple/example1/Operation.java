package pattern.factory.simple.example1;

/**
 * Author li.ling
 * Description 简单工厂模式 - 实现简单计算器
 * Date 2021/6/18 15:30
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