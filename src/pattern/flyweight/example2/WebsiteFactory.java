package pattern.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * Author li.ling
 * Description
 * Date 2021/7/7 17:03
 */
public class WebsiteFactory {

    private Map<String, Website> flyweights = new HashMap<>();

    // 获得网站的分类
    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    // 获得网站分类的总数
    public int getWebsiteCount() {
        return flyweights.size();
    }
}

