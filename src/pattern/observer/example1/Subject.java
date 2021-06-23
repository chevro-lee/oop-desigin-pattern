package pattern.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author li.ling
 * Description 通知者抽象
 * Date 2021/6/22 17:33
 */
public abstract class Subject {

    protected List<Observer> observers;

    private String action;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    // 添加观察者
    protected abstract void attach(Observer observer);

    // 删除观察者
    protected abstract void detach(Observer observer);

    // 通知观察者
    public abstract void notifyOb();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
