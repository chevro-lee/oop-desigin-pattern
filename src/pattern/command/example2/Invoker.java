package pattern.command.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 11:17
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invokeCommand() {
        command.execute();
    }
}
