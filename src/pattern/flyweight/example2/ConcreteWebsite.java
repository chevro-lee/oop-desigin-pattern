package pattern.flyweight.example2;

/**
 * Author li.ling
 * Description 对应了有相同的内部状态的实例
 * Date 2021/7/7 16:57
 */
public class ConcreteWebsite extends Website {

    // 共享的内部状态：网站类别名
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + "用户：" + user.getName());
    }
}
