package pattern.state.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 17:07
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        // 定义A的状态下一个状态是B
        context.setState(new ConcreteStateB());
    }
}
