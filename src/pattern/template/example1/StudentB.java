package pattern.template.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/21 17:22
 */
public class StudentB extends StudentBehavior {

    public StudentB(String name) {
        super(name);
    }

    @Override
    protected void eat() {
        System.out.println(name + "吃面");
    }

    @Override
    protected void study() {
        System.out.println(name + "学习语数外");
    }

    @Override
    protected void play() {
        System.out.println(name + "看动漫");
    }
}
