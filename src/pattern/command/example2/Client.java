package pattern.command.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 11:19
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker i = new Invoker();
        i.setCommand(command);
        i.invokeCommand();
    }
}
