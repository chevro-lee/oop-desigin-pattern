package pattern.proxy.example1;

/**
 * Author li.ling
 * Description 真实追求者类 代表真实的请求实体
 * Date 2021/6/20 16:23
 */
public class Pursuit implements IGiveGift {

    private SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(this.girl.getName() + "，送你玩偶");
    }

    @Override
    public void giveFlowers() {
        System.out.println(this.girl.getName() + "，送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.girl.getName() + "，送你巧克力");
    }
}
