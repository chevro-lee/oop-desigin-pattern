package pattern.factory.abst;

/**
 * Author li.ling
 * Description 抽象工厂模式 示例来自菜鸟教程
 * Date 2021/6/23 11:30
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
