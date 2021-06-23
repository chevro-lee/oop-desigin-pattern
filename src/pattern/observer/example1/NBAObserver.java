package pattern.observer.example1;

/**
 * Author li.ling
 * Description NBA观察者
 * Date 2021/6/22 18:13
 */
public class NBAObserver extends Observer {


    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "," + name + "不要看NBA了,赶快工作！");
    }
}
