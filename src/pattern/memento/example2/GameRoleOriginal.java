package pattern.memento.example2;

/**
 * Author li.ling
 * Description 游戏角色类
 * Date 2021/6/24 14:13
 */
public class GameRoleOriginal {

    private int vit;

    private int atk;

    private int def;

    // 保存角色状态
    public RoleMemento saveSate() {
        return new RoleMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoveryRoleSate(RoleMemento roleMemento) {
        this.vit = roleMemento.getVit();
        this.atk = roleMemento.getAtk();
        this.def = roleMemento.getDef();
    }


    public void getInitSate() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void sateDisplay() {
        System.out.println("当前游戏角色生命："+this.vit);
        System.out.println("当前游戏角色攻击："+this.atk);
        System.out.println("当前游戏角色防御："+this.def);
    }

    public void fight() {
        this.vit = 0;
        this.atk = 60;
        this.def = 20;
    }
}
