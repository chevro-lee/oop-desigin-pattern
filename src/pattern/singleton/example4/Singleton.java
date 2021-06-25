package pattern.singleton.example4;

/**
 * Author li.ling
 * Description 双重检查 - 单例模式
 * 优点：延迟化加载，节省了内存
 *      通过双重检查机制，具有不错的性能
 * Date 2021/6/25 15:07
 */
public class Singleton {

    // private static Singleton instance;
    // 加上volatile关键字可避免以下注释问题
    private volatile static Singleton instance;

    private Singleton() {}


    /**
     * 双重检查
     * 第一重检查没有加锁，当多个线程执行到第一次检查，判断有实例对象，直接就返回了，
     * 而检查到没有对象的线程，则会加锁，进行实例化对象的操作。通过第第一层检查，
     * 大大提高了程序的性能。
     * 但是这个写法有些问题
     * 因为当线程在初始化对象的时候，需要消耗一定的时间，但是这个对象的地址已经初始化了，并且没有完全初始化成功
     * 而这是有线程执行了第一层检查，检查到这个对象存在，直接返回了，而没有初始化成功的对象被返回，只能返回null了
     * 因此，这个双重检查的写法是有待改进的。
     * 通过加volatile关键字防止指令重排序即可避免以上的问题。
     *
     * @return Singleton
     */
    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
