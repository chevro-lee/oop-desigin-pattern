package pattern.bridge.example1;

/**
 * Author li.ling
 * Description 形状类
 * Date 2021/6/28 9:28
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
