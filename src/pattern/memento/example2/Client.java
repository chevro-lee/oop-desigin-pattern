package pattern.memento.example2;

/**
 * Author li.ling
 * Description
 * Date 2021/6/24 14:39
 */
public class Client {

    public static void main(String[] args) {
        GameRoleOriginal lixiaoyao = new GameRoleOriginal();
        System.out.println("准备攻打boss！");
        lixiaoyao.getInitSate();
        lixiaoyao.sateDisplay();

        // 保存进度,由于封装在RoleMemento类中，因此我们并不知道保存了那些具体的角色数据
        RoleCaretaker roleCaretaker = new RoleCaretaker();
        roleCaretaker.setRoleMemento(lixiaoyao.saveSate());

        System.out.println("boss太厉害了，Game Over！");
        lixiaoyao.fight();
        lixiaoyao.sateDisplay();

        // 恢复之前的状态
        System.out.println("游戏读档，再来一次");
        lixiaoyao.recoveryRoleSate(roleCaretaker.getRoleMemento());
        lixiaoyao.sateDisplay();
    }
}
