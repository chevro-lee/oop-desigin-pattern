package pattern.state.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 17:08
 */
public class ConcreteStateB extends State{


    @Override
    public void handle(Context context) {
        // 设置B的下一个状态是A
        context.setState(new ConcreteStateA());
    }
}
