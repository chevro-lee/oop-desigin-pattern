package pattern.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author li.ling
 * Description
 * Date 2021/6/25 10:22
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        List<Object> list = new ArrayList<>();
        list.add("大鸟");
        list.add("小菜");
        list.add("行李");
        list.add("外国人");
        list.add("公司员工");
        list.add("小偷");
        aggregate.setItems(list);

        Iterator iterator = aggregate.createIterator();
        System.out.println(iterator.first());

        while (!iterator.isDone()) {
            System.out.println("请买票，" + iterator.current());
            iterator.next();
        }
    }
}
