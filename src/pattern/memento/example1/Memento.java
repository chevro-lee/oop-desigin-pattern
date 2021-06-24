package pattern.memento.example1;

/**
 * Author li.ling
 * Description 备忘录类
 * Date 2021/6/24 11:16
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
