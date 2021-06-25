package pattern.iterator;

/**
 * Author li.ling
 * Description
 * Date 2021/6/24 18:37
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        ++current;
        if (current < aggregate.getCount()) {
            ret = aggregate.getItems().get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object current() {
        return aggregate.getItems().get(current);
    }
}
