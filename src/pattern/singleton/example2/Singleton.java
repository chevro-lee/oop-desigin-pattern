package pattern.singleton.example2;

/**
 * Author li.ling
 * Description 懒汉式 单例模式
 * 这种懒汉式的单例模式，由于是调用时才初始化，因此节省了内存
 * 由于此时加了synchronized，所以是线程安全的，但是必须加锁才能保证线程安全，所以效率偏低
 * 不常用
 * Date 2021/6/25 11:37
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
