package pattern.singleton.example5;

/**
 * Author li.ling
 * Description 静态内部类 - 单例模式
 * 能和双重检查类达到一样的效果，但实现起来更简单
 * Date 2021/6/25 16:02
 */
public class Singleton {


    /**
     * 通过Classloader机制来保证初始化instance时只有一个线程，与饿汉模式不通的是，饿汉模式只要类被加载了，
     * 就会实例化instance，而这种方式即使Singleton类被装载了，instance不一样被实例化，因为SingletonHolder
     * 类并没有被主动使用，只有当显示调用getInstance（）方法的时候，才会实例化instance
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
