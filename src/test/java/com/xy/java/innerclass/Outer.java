package com.xy.java.innerclass;

import org.junit.Test;

public class Outer {

    int outerField = 0;

    /**
     * 非静态内部类
     */
    class Inner {

        void innerMethod() {
            System.out.println("outerField: " + outerField);
        }
    }

    /**
     * 静态内部类
     */
    static class StaticInner {

        void innerMethod() {
            // 无法访问 Outer.outerField
//            System.out.println("outerField: " + outerField);
        }
    }

    @Test
    public void testInner() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

    @Test
    public void testStaticInner() {
        StaticInner staticInner = new StaticInner();
        staticInner.innerMethod();
    }
}
