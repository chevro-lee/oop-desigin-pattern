package pattern.command.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 11:15
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
