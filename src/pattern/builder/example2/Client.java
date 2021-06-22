package pattern.builder.example2;

/**
 * Author li.ling
 * Description 客户端
 * Date 2021/6/22 16:02
 */
public class Client {

    public static void main(String[] args) {
        Product product = new ConcreteBuilder()
                .buildA("地基")
                .buildB("钢筋水泥")
                .buildC("安装电路")
                .buildD("装修").build();
        System.out.println(product);

    }
}
