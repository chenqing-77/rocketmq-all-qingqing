package org.apache.rocketmq.test.chenqing;

import org.junit.Test;


public class Test1 {

    @Test
    public void runtimeTest(){
        int a = Runtime.getRuntime().availableProcessors();
        System.out.println(a);
    }
}
