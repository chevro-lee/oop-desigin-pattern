package pattern.observer.example1;

/**
 * Author li.ling
 * Description 客户端
 * Date 2021/6/22 18:18
 */
public class Client {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setAction("胡汉三回来了");
        Observer observer1 = new NBAObserver("张三", boss);
        Observer observer2 = new NBAObserver("李四", boss);
        boss.attach(observer1);
        boss.attach(observer2);
        boss.detach(observer1);
        boss.notifyOb();
    }
}
