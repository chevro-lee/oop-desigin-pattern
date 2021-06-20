package pattern.decorator.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/20 14:02
 */
public class Finery extends Person{

    protected Person person;

    public Finery(){}

    // 打扮
    public void decorate(Person component){
        this.person = component;
    }

    // 展示
    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
