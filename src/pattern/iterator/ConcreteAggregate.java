package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author li.ling
 * Description
 * Date 2021/6/24 18:40
 */
public class ConcreteAggregate extends Aggregate{

    private List<Object> items = new ArrayList<>();


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public int getCount() {
        return this.items.size();
    }
}
