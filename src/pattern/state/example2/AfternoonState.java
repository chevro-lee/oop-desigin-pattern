package pattern.state.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 18:05
 */
public class AfternoonState extends State {

    @Override
    public void handle(ContextWork work) {
        if (work.getHour() >= 14 && work.getHour() < 18) {
            System.out.println("下午" + work.getHour() + "点，工作斗志昂扬");
        } else {
            // 不在上午区间，则转到中午区间
            work.setState(new NoonState());
            work.request();
        }
    }
}
