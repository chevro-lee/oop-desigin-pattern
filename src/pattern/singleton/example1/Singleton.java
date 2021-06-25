package pattern.singleton.example1;

/**
 * Author li.ling
 * Description 单例模式
 * 懒汉式（没有立刻提供构造函数，而是放到公有的方法中去实例化）
 * 线程不安全（单例模式一般用于多线程环境，所以严格意思上来说它不算单例模式）
 * 私有化构造函数，使用静态的公有方法提供只实例化一次的类对象
 * 这种结构下的单例模式，由于没有加synchronized,所以不能不能保证线程安全
 * Date 2021/6/25 11:04
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
