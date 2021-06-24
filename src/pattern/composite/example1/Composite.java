package pattern.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author li.ling
 * Description 树枝
 * Date 2021/6/24 15:33
 */
public class Composite extends Component {

    // 用于存储其下属的枝节点和叶子节点
    private List<Component> children = new ArrayList<>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    // 显示枝节点名称，并对其下级进行遍历
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.print(name+"\n");
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
