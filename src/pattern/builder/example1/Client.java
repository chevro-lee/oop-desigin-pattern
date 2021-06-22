package pattern.builder.example1;

/**
 * Author li.ling
 * Description 客户端
 * Date 2021/6/22 15:15
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }
}
