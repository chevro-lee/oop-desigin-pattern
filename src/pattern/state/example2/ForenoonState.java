package pattern.state.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 17:56
 */
public class ForenoonState extends State {

    @Override
    public void handle(ContextWork work) {
        if (work.getHour() >= 9 && work.getHour() < 12) {
            System.out.println("早上" + work.getHour() + "点，工作精神抖擞");
        } else {
            // 不在上午区间，则转到中午区间
            work.setState(new NoonState());
            work.request();
        }
    }
}
