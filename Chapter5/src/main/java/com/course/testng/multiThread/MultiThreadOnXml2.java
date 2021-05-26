package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/19
 */
public class MultiThreadOnXml2 {
    @Test
    public void test1(){
        System.out.printf("Thread Id2 : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id2 : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id2 : %s%n",Thread.currentThread().getId());
    }
}
