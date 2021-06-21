package pattern.template.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/21 17:31
 */
public class Client {

    public static void main(String[] args) {
        StudentA studentA = new StudentA("小明");
        studentA.behavior();
        StudentB studentB = new StudentB("大鹏");
        studentB.behavior();
    }
}
