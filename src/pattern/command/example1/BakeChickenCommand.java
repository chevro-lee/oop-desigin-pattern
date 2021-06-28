package pattern.command.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 10:30
 */
public class BakeChickenCommand extends Command {

    public BakeChickenCommand(IBarbecuer iBarbecuer) {
        super(iBarbecuer);
    }

    @Override
    protected void execute() {
        barbecuer.chicken();
    }
}
