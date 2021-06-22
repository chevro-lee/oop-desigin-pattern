package pattern.builder.example2;


/**
 * Author li.ling
 * Description 抽象建造类 抽象建造的过程
 * Date 2021/6/22 15:47
 */
public abstract class Builder {

    // 模拟盖房子，先搭地基
    abstract Builder buildA(String buildA);

    // 钢筋骨架
    abstract Builder buildB(String buildB);

    // 铺电线
    abstract Builder buildC(String buildC);

    // 粉刷
    abstract Builder buildD(String buildD);

    abstract Product build();
}
