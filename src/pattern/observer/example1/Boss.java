package pattern.observer.example1;


/**
 * Author li.ling
 * Description 具体的通知者类，这里为老板类
 * Date 2021/6/22 17:53
 */
public class Boss extends Subject{

    @Override
    protected void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    protected void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOb() {
        for (Observer ob : observers) {
            ob.update();
        }
    }
}
