package pattern.command.example1;

/**
 * Author li.ling
 * Description 具体执行者2
 * Date 2021/6/28 10:29
 */
public class BakekebabCommand extends Command {

    public BakekebabCommand(IBarbecuer iBarbecuer) {
        super(iBarbecuer);
    }

    @Override
    protected void execute() {
        barbecuer.kebab();
    }
}
