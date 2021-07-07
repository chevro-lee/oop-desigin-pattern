package pattern.flyweight.example2;

/**
 * Author li.ling
 * Description 用户类，网站类的外部状态
 * Date 2021/7/7 16:54
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
