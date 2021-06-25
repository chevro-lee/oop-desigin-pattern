package pattern.singleton.example6;

/**
 * Author li.ling
 * Description 枚举 - 单例模式
 *             出自Effective Java一书中，作者提倡
 *             此种方式更简洁
 *             自动支持序列化机制
 *             防止多次实例化
 * Date 2021/6/25 16:16
 */
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {}
}
