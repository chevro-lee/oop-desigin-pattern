package pattern.decorator.example1;

/**
 * Author li.ling
 * Description 装饰模式
 * Date 2021/6/20 13:52
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show() {
        System.out.println("装扮的" + this.name);
    }
}
