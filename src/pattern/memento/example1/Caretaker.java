package pattern.memento.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author li.ling
 * Description 管理者 得到或是设置备忘录
 * Date 2021/6/24 11:13
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
