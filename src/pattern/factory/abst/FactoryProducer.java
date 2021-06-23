package pattern.factory.abst;

/**
 * Author li.ling
 * Description 具体的工厂创造类
 * Date 2021/6/23 11:55
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("形状")) {
            return new ShapeFactory();
        } else if (choice.equals("颜色")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
