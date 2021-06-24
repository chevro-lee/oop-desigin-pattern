package pattern.memento.example1;

/**
 * Author li.ling
 * Description 创建备忘录或是在Memento中存储状态
 * Date 2021/6/24 11:18
 */
public class Originator {

    // 需要保存的属性，这里为state，可能有多个
    private String state;

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复备忘录
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
