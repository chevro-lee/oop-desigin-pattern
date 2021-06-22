package pattern.builder.example1;

/**
 * Author li.ling
 * Description 抽象建造者
 * Date 2021/6/22 14:58
 */
public abstract class Builder {

    // 模拟盖房子，先搭地基
    abstract void buildA();

    // 钢筋骨架
    abstract void buildB();

    // 铺电线
    abstract void buildC();

    // 粉刷
    abstract void buildD();

    // 生产产品
    abstract Product getProduct();
}
