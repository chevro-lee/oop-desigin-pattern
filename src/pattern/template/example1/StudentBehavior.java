package pattern.template.example1;

/**
 * Author li.ling
 * Description  模板方法模式，将统一的行为封装到抽象类中，有个性化的步骤，延迟到子类实现
 *              学生的一天行为
 * Date 2021/6/21 17:01
 */
public abstract class StudentBehavior {

    protected String name;

    public StudentBehavior(String name) {
        this.name = name;
    }

    // 吃饭
    protected abstract void eat();

    // 学习
    protected abstract void study();

    // 玩耍
    protected abstract void play();

    private void run() {
        System.out.println(name + "晨间跑步");
    }

    private void lateSelfStudy() {
        System.out.println(name + "晚自习");
    }

    protected void behavior() {
        eat();
        run();
        study();
        lateSelfStudy();
        play();
    }
}
