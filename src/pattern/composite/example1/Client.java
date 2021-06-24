package pattern.composite.example1;

/**
 * Author li.ling
 * Description 组合模式 客户端调用程序
 * Date 2021/6/24 15:39
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("leaf B"));

        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("Leaf XA"));
        composite.add(new Leaf("Leaf XB"));

        root.add(composite);

        Composite composite1 = new Composite("Composite XY");
        composite1.add(new Leaf("Leaf XYA"));
        composite1.add(new Leaf("Leaf XYB"));

        composite.add(composite1);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
