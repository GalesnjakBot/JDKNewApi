package com.galesnjak.api;

/**
 * @author galesnjak
 * ITest实现类
 */
public class TestImpl implements ITest {
    @Override
    public void test() {
        System.out.println("[method:test]");
        //call test3
        test3();
    }

    public static void main(String[] args) {
        ITest test = new TestImpl();
        test.test2();
        test.test();
    }
}
