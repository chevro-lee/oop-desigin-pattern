package pattern.command.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/28 10:33
 */
public class Client {

    public static void main(String[] args) {
        IBarbecuer barbecuer = new Barbecuer();
        Command command1 = new BakeChickenCommand(barbecuer);
        Command command2 = new BakeHamCommand(barbecuer);
        Command command3 = new BakekebabCommand(barbecuer);
        Waiter waiter = new Waiter();
        waiter.setCommand(command1);
        waiter.setCommand(command2);
        waiter.setCommand(command3);
        waiter.remove(command2);
        waiter.notifyBar();
    }
}
