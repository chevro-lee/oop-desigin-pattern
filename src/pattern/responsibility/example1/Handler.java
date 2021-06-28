package pattern.responsibility.example1;

/**
 * Author li.ling
 * Description 责任链模式，web中很多应用，如过滤器，拦截器等等
 * Date 2021/6/28 16:04
 */
public abstract class Handler {

    protected Handler successor;

    // 设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
