package pattern.state.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/23 18:08
 */
public class Client {

    public static void main(String[] args) {
        ContextWork work = new ContextWork();
        work.setHour(10);
        work.request();

        work.setHour(13);
        work.request();

        work.setHour(16);
        work.request();
    }
}
