package pattern.iterator;

/**
 * Author li.ling
 * Description 迭代器抽象类
 *             迭代器模式，基本核心就是这个迭代器抽象类，通过实现一个具体的迭代器
 *             然后在其中引入具体的聚合类也即是集合对象，通过封装next(),current(),isDone()等一系列方法
 *             实现对聚合对象的遍历。通过封装一个迭代器进行遍历，可以对集合进行多种遍历方式，而客户端不需要知道其
 *             内部细节。
 * Date 2021/6/24 18:14
 */
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object current();
}
