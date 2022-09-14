package ws.login.java2;

/**
 *author su
 *Create by on 2022/9/14 11:04
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {


    /**
     * 1.泛型在继承方面的体现
     *  类A是类B的父类，G<A>和G<B>二者不具备父子关系，二者是并列关系
     *  类A是类B的父类，A<G>是B<G>的父类
     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;
        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时的list和list2的类型不具有子父类关系
//        list1 = list2; //编译不通过
        /*
        反证法：
        假设list1=list2;
        list1.add(123);导致混入非String的数据，报错
         */
    }

    public void show(List<Object> list){

    }
    public void show1(List<String> list){

    }
    @Test
    public void test2(){
        List<String> list1 = null;
        ArrayList<String> list2 = null;
        list1 = list2;
    }

    /**
     * 通配符
     * 通配符：?
     * 类A是类B的父类，G<A>和G<B>是没有关系的，二者的共同父类是G<?>
     */
    @Test
    public void test3(){
        List<Object> list1 = new ArrayList<>();
        list1.add(1);
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        List<?> list = null;
        list = list1;
        //对于List<?>就不能向其内部添加数据
        //除了添加null
//        list.add();
        print(list1);
        print(list2);
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 3.有限制条件的通配符
     * ? extends A:G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类
     *
     * ? super A:G<? super A> 可以作为G<A>和G<B>的父类，其中B是A的父类类
     */
    @Test
    public void test4(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;
    }


}
