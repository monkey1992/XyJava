package com.xy.java.innerclass;

import org.junit.Test;

public class InnerClassTest {

    @Test
    public void testInnerClass() {
        // 不能访问非静态内部类的构造方法
//        Outer.Inner inner = new Outer.Inner();

        // 能访问静态内部类的构造方法
        Outer.StaticInner staticInner = new Outer.StaticInner();
    }
}
