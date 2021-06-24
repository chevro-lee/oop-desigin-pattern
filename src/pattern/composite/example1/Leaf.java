package pattern.composite.example1;

/**
 * Author li.ling
 * Description 在组合中表示叶节点对象，叶节点没有子节点
 * Date 2021/6/24 15:26
 */
public class Leaf extends Component{


    public Leaf(String name) {
        super(name);
    }

    // 叶子没有再增加分支和树叶，所有add和remove方法实现它没有意义，但这样做可以消除叶节点和枝节点
    // 对象在抽象层次的区别，他们具备完全一致的接口
    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    // 叶子节点的具体方法
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.print(name+"\n");
    }
}
