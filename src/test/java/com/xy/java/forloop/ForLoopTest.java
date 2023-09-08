package com.xy.java.forloop;

import org.junit.Test;

public class ForLoopTest {

    @Test
    public void testForLoop() {
        int i = 0;
        for (; ; ) {
            if (i == 100) {
                return;
                // return; 等价于 break;
                // break;
            }
            i++;
            System.out.println("第 " + i + " 次 for 循环");
        }
        // 上面 for 循环代码等价于：
//        while (i != 100) {
//            i++;
//            System.out.println("第 " + i + " 次 for 循环");
//        }
    }
}
