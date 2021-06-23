package pattern.observer.example1;

/**
 * Author li.ling
 * Description 股票观察者
 * Date 2021/6/22 18:08
 */
public class StockObserver extends Observer {

    private String name;

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "," + name + "不要看股票了,赶快工作！");
    }
}
