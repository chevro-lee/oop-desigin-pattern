package pattern.command.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 11:16
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
