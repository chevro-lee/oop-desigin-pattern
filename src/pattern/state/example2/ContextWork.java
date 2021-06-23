package pattern.state.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 17:32
 */
public class ContextWork {

    private State state;

    // 时间，用于判断状态转换依据
    private double hour;


    public ContextWork() {
        this.state = new ForenoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void request() {
        // 对请求做出处理，并设置下一状态
        this.state.handle(this);
    }
}
