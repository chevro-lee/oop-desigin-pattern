package pattern.singleton.example3;

/**
 * Author li.ling
 * Description 饿汉式 单例模式
 * 这个单例模式也是线程安全的（基于ClassLoader机制避免多线程的同步问题），
 * 并且没有加锁，所以效率会很高。
 * 常用
 * Date 2021/6/25 11:47
 */
public class Singleton {

    // 类加载时就初始化，浪费内存，会产生很多垃圾对象
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
