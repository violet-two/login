package ws.login.exer1;

import java.util.*;

/**
 * author su
 * Create by on 2022/9/14 11:57
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();
    //保存T类型的对象到map中
    public void save(String id,T entity){
        map.put(id, entity);
    }
    //从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }
    //根据id更新map的对象
    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }
    //查询所有对象
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T value : values) {
            list.add(value);
        }
        return list;
    }
    //删除map的所有对象
    public void delete(String id){
        map.remove(id);
    }
}
