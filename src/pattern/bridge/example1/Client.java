package pattern.bridge.example1;

/**
 * Author li.ling
 * Description 案例来自菜鸟教程。画不同形状不同颜色的图形
 * Date 2021/6/28 9:44
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("画不同颜色的形状");
        Shape circle = new Circle();
        circle.setColor(new Black());
        circle.draw();
        Square square = new Square();
        square.setColor(new White());
        square.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new Black());
        rectangle.draw();
    }
}
