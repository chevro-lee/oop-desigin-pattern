package pattern.command.example1;

/**
 * Author li.ling
 * Description 具体命令者1
 * Date 2021/6/28 10:26
 */
public class BakeHamCommand extends Command {

    public BakeHamCommand(IBarbecuer iBarbecuer) {
        super(iBarbecuer);
    }

    @Override
    protected void execute() {
        barbecuer.ham();
    }
}
