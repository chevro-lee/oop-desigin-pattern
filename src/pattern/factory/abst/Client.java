package pattern.factory.abst;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 14:07
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("画一个黄色的圆");
        AbstractFactory factory = FactoryProducer.getFactory("形状");
        Shape shape = factory.getShape("圆");
        shape.draw();
        AbstractFactory factory1 = FactoryProducer.getFactory("颜色");
        Color color = factory1.getColor("黄");
        color.fill();
    }
}
