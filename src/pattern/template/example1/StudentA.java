package pattern.template.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/21 17:20
 */
public class StudentA extends StudentBehavior {

    public StudentA(String name) {
        super(name);
    }

    @Override
    protected void eat() {
        System.out.println(super.name + "吃包子");
    }

    @Override
    protected void study() {
        System.out.println(super.name + "学习数理化");
    }

    @Override
    protected void play() {
        System.out.println(super.name + "玩游戏");
    }
}
