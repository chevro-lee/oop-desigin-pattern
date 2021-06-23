package pattern.factory.abst;

/**
 * Author li.ling
 * Description 颜色工厂类
 * Date 2021/6/23 11:49
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        Color c = null;
        switch (color) {
            case "黄":
                c = new Yellow();
                break;
            case "蓝":
                c = new Blue();
                break;
        }
        return c;
    }
}
