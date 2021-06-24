package pattern.memento.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/24 11:28
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setMemento(new Memento("state_1"));
        o.setMemento(new Memento("state_2"));
        Caretaker c = new Caretaker();
        c.add(o.createMemento());
        o.setMemento(new Memento("state_3"));
        c.add(o.createMemento());
        o.setMemento(new Memento("state_4"));
        c.add(o.createMemento());

        System.out.println("当前状态："+o.toString());
        o.setMemento(c.get(0));
        System.out.println("第一次状态："+o.toString());
        o.setMemento(c.get(1));
        System.out.println("第二次状态："+o.toString());
    }
}
