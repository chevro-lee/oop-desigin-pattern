package pattern.command.example1;

/**
 * Author li.ling
 * Description 抽象命令类
 * Date 2021/6/28 10:23
 */
public abstract class Command {

    protected IBarbecuer barbecuer;

    public Command(IBarbecuer iBarbecuer) {
        barbecuer = iBarbecuer;
    }

    protected abstract void execute();
}
