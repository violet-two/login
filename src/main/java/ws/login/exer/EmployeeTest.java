package ws.login.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void test1(){
        TreeSet<Employee> set = new TreeSet<>(
                (e1, e2) -> {
            MyDate b1 = e1.getMyDate();
            MyDate b2 = e2.getMyDate();
            return b2.compareTo(b1);
        }
        );
        Employee e1 = new Employee("a",11,new MyDate(2000,1,1));
        Employee e2 = new Employee("b",22,new MyDate(1000,2,2));
        Employee e3 = new Employee("c",33,new MyDate(1500,3,3));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee next = iterator.next();
            System.out.println(next);
        }
    }
}
