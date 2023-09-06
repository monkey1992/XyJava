package com.xy.java.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void test1() {
        String a = "123";
        String b = "123";
        assert a == b;
        String c = b;
        assert c == a;
        String d = new String("123"); // new 会在堆中创建新的对象
        assert d != a;
        String e = new String("123"); // new 会在堆中创建新的对象
        assert e != d;
    }
}
