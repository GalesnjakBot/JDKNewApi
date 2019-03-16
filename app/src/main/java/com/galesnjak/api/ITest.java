package com.galesnjak.api;

/**
 * @author galesnjak
 * 作用：default关键字使用（备注：1.8以前接口类只能定义接口不能有实现方法）
 */
public interface ITest {
    /**
     * 测试接口
     */
    void test();

    /**
     * 通过default关键字修饰方法可以让我们在接口里面定义具体的方法实现，如下：
     */
    default void test2(){
        System.out.println("[method:test2]");
    }

    /**
     *
     */
    default void test3(){
        System.out.println("[method:test3]");
    }
}
