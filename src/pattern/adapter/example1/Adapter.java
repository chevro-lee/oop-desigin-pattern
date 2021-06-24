package pattern.adapter.example1;

/**
 * Author li.ling
 * Description 适配类
 * Date 2021/6/24 9:57
 */
public class Adapter extends Target {

    // 核心就是建立一个私有的Adaptee对象
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 表面调用的是普通的请求方法，实际却是特殊的请求方法
        adaptee.specialRequest();
    }
}
