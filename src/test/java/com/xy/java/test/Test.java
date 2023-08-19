package com.xy.java.test;

import java.util.function.Supplier;

public class Test {

    ThreadLocal<A> aThreadLocal = new ThreadLocal<>();

    void test() {
        A a = new A();
        ThreadLocal.withInitial(new Supplier<A>() {
            @Override
            public A get() {
                return a;
            }
        });
        aThreadLocal.set(a);
        aThreadLocal.get();
        aThreadLocal.remove();

        String name = A.name;
        A.getName();
        B b = new B();
        String name1 = B.name;
        B.getName();
    }
}
