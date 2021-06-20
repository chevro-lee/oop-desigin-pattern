package pattern.proxy.example1;

/**
 * Author li.ling
 * Description 代送礼物的戴笠 对应代理者
 * Date 2021/6/20 16:28
 */
public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
