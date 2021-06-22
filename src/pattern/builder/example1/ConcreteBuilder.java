package pattern.builder.example1;

/**
 * Author li.ling
 * Description 具体建造者
 * Date 2021/6/22 15:05
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }


    @Override
    void buildA() {
        this.product.setBuildA("地基");
    }

    @Override
    void buildB() {
        this.product.setBuildB("钢筋骨架");
    }

    @Override
    void buildC() {
        this.product.setBuildC("安装电路");
    }

    @Override
    void buildD() {
        this.product.setBuildD("装修");
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
