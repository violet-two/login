package ws.login.exer1;

import java.util.List;

/**
 * author su
 * Create by on 2022/9/14 14:09
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(1001,34,"a"));
        dao.save("1002",new User(1002,35,"b"));
        dao.save("1003",new User(1003,36,"v"));
        dao.save("1004",new User(1004,37,"d"));

        dao.update("1001",new User(1001,34,"aaaa"));
        dao.delete("1002");
        List<User> list = dao.list();
        list.forEach(System.out::println);

    }
}
