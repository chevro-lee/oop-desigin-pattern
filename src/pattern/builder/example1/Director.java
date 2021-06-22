package pattern.builder.example1;

/**
 * Author li.ling
 * Description 指挥者
 * Date 2021/6/22 15:12
 */
public class Director {

    public Product create(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
