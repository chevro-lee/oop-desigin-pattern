package pattern.factory.simple.example1;

import java.lang.reflect.InvocationTargetException;

/**
 * Author li.ling
 * Description
 * Date 2021/6/18 15:51
 */
public class OperationFactory {

    /**
     * 利用反射实例化客户端需要的对象
     * 当项目初期使用了工厂类，逐渐维护会产生很多个工厂类，
     * 如果使用switch，case进行逻辑判断，判断逻辑将会很长
     *
     * @param className
     * @param clazz
     * @return
     */
    public static <T>T createOperation(String className, Class<T> clazz) {
        T operation = null;
        try {
            operation = (T) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operation;
    }

    public static Operation createOperation(String operation) {
        Operation operate;
        switch (operation) {
            case "+":
                operate = new OperationAdd();
                break;
            case "-":
                operate = new OperationSub();
                break;
            case "*":
                operate = new OperationMul();
                break;
            case "/":
                operate = new OperationDiv();
                break;
            default:
                operate = null;
                break;
        }
        return operate;
    }
}
