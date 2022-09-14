package ws.login.generic;

import org.junit.Test;

import java.util.*;

public class GenericTest1 {

    /** 如何自定义泛型类：泛型类、泛型接口、泛型方法；
     *
     * 1.关于自定义泛型类、泛型接口：
     *
     *
     */

    @Test
    public void test1() {
        //如何定义了泛型类，实例化时没有指明泛型类型，则默认为Object
        //要求：如何定义了是带泛型的，建议在实例化时要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("a");

        //建议实例化带上泛型
        Order<String> order1 = new Order<>();
    }

    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(1);
    }
}

