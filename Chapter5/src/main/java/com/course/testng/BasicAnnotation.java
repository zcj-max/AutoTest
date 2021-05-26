package com.course.testng;

import org.testng.annotations.*;

/**
 * @author zhengchuanjie
 * @date 2021/5/12
 */
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类执行之前执行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类执行之后执行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite套件");
    }

    /**
     * 该类的运行结果如下所示：
     *   beforeSuite套件
         BeforeClass这是在类执行之前执行的方法
         BeforeMethod这是在测试方法之前运行的
         Test这是测试用例1
         AfterMethod这是在测试方法之后运行的
         BeforeMethod这是在测试方法之前运行的
         Test这是测试用例2
         AfterMethod这是在测试方法之后运行的
         AfterClass这是在类执行之后执行的方法
         AfterSuite套件
     */

}
