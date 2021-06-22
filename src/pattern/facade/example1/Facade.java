package pattern.facade.example1;

/**
 * Author li.ling
 * Description 外观模式
 * Date 2021/6/22 11:24
 */
public class Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
    }

    // 通过外观模式提供给客户端的方法
    public void methodA() {
        System.out.println("----方法组A----");
        this.subSystemOne.methodOne();
        this.subSystemTwo.methodTwo();
    }

    public void methodB() {
        System.out.println("----方法组B----");
        this.subSystemOne.methodOne();
        this.subSystemThree.methodThree();
    }
}
