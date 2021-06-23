package pattern.state.example1;

/**
 * Author li.ling
 * Description 负责维护具体状态实例，用此类定义当前的状态
 * Date 2021/6/23 17:01
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        // 对请求做出处理，并设置下一状态
        this.state.handle(this);
    }
}
