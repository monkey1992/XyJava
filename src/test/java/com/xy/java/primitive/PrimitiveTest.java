package com.xy.java.primitive;

import org.junit.Test;

public class PrimitiveTest {

    @Test
    public void testInt() {
        int a = 1;
        int b = 1;
        assert a == b;
        int c = b;
        assert c == a;
        int d = new Integer(1);
        assert d == a;
        int e = Integer.parseInt("1");
        assert e == a;
        int f = Integer.valueOf("1");
        assert f == a;
        int g = 2 - 1;
        assert g == a;
    }

    @Test
    public void testByte() {
        byte a = 1;
        byte b = 1;
        assert a == b;
        byte c = b;
        assert c == a;
        byte d = new Byte(a);
        assert d == a;
        byte e = Byte.parseByte("1");
        assert e == a;
        byte f = Byte.valueOf("1");
        assert f == a;
        byte g = 2 - 1;
        assert g == a;
    }

    @Test
    public void testChar() {
        char a = 1;
        char b = 1;
        assert a == b;
        char c = b;
        assert c == a;
        char d = new Character(a);
        assert d == a;
        char e = Character.valueOf(a);
        assert e == a;
        char f = 2 - 1;
        assert f == a;
    }
}
