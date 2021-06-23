package pattern.state.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 18:00
 */
public class NoonState extends State {

    @Override
    public void handle(ContextWork work) {
        if (work.getHour() >= 12 && work.getHour() < 14) {
            System.out.println("中午"+work.getHour()+"点，吃完饭犯困！");
        } else {
            work.setState(new AfternoonState());
            work.request();
        }
    }
}
