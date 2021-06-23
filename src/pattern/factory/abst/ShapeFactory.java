package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 11:37
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        Shape s = null;
        switch (shape) {
            case "圆":
                s = new Circle();
                break;
            case "长方形":
                s = new Rectangle();
                break;
            case "正方形":
                s = new Square();
                break;
        }
        return s;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
