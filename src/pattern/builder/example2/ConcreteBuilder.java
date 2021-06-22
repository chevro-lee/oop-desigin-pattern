package pattern.builder.example2;


/**
 * Author li.ling
 * Description 具体建造者
 *             这里与example1 的区别就在于，这个示例的建造者模式没有Director指挥者
 *             更像是一个自动的流水线式的建造，每个部分的建造都返回抽象建造者的类，知道
 *             建造完了才通过build()方法返回具体的产品。
 *             而example1,则每次建造一个部分都返回一个产品示例，最后由director去统筹建造
 *             的每个方法生产具体的Product
 * Date 2021/6/22 15:48
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }


    @Override
    Builder buildA(String buildA) {
        product.setBuildA(buildA);
        return this;
    }

    @Override
    Builder buildB(String buildB) {
        product.setBuildB(buildB);
        return this;
    }

    @Override
    Builder buildC(String buildC) {
        product.setBuildC(buildC);
        return this;
    }

    @Override
    Builder buildD(String buildD) {
        product.setBuildD(buildD);
        return this;
    }

    @Override
    Product build() {
        return product;
    }
}
