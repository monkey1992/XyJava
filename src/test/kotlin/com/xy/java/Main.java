package com.xy.java;

import org.junit.Test;

public class Main {

    class A {
        public String name;
    }

    class B {
        public A a;

        public B() {
            a = new A();
            a.name = "AAA";
        }
    }

    class C {
        public A a;

        public C(A a) {
            this.a = a;
        }
    }

    @Test
    public void testParams() {
        B b = new B();
        System.out.println("b.a: " + b.a.name);
        C c = new C(b.a);
        System.out.println("c.a: " + c.a.name);
        c.a.name = "123";
        System.out.println("b.a: " + b.a.name);
        System.out.println("c.a: " + c.a.name);
    }

    @Test
    public void testParams2() {
        A a = new A();
        a.name = "AAA";
        System.out.println("a: " + a + ", " + a.name);
        trans(a);
        System.out.println("a: " + a + ", " + a.name);
    }

    public void trans(A a) {
        System.out.println("trans a: " + a + ", " + a.name);
        a.name = "123";
        A a2 = new A();
        a2.name = "a222";
        a = a2;
        System.out.println("trans a: " + a + ", " + a.name);
    }
}
