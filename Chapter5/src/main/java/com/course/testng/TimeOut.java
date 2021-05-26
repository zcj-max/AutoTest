package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/25
 */
public class TimeOut {
    @Test(timeOut = 1000)//单位是毫秒
    public void test() throws InterruptedException {
        Thread.sleep(2);
        System.out.println("测试");
    }
}
