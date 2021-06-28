package pattern.command.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author li.ling
 * Description 命令协调者类
 * Date 2021/6/28 10:31
 */
public class Waiter {

    private List<Command> commands = new ArrayList<>();

    public void notifyBar() {
        if (commands == null) {
            return;
        }
        for (Command command : commands) {
            command.execute();
        }
    }

    public void setCommand(Command command) {
        System.out.println("客户下单");
        if (command instanceof BakekebabCommand) {
            System.out.println("不好意思，羊肉串卖完了");
        } else {
            commands.add(command);
        }
    }

    public void remove(Command command) {
        commands.remove(command);
        System.out.println("客户取消订单");
    }
}
