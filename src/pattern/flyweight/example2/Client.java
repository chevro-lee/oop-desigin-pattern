package pattern.flyweight.example2;

/**
 * Author li.ling
 * Description 享元模式客户端
 *
 * Date 2021/7/7 17:07
 */
public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website website = factory.getWebsiteCategory("产品展示");
        website.use(new User("小菜"));
        Website website1 = factory.getWebsiteCategory("产品展示");
        website1.use(new User("大鸟"));
        Website website2 = factory.getWebsiteCategory("博客");
        website2.use(new User("娇娇"));
        Website website3 = factory.getWebsiteCategory("博客");
        website3.use(new User("戴笠"));
        System.out.println("得到的网站创建总数为：" + factory.getWebsiteCount());
    }
}
