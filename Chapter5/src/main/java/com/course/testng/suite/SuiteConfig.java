package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


/**
 * @author zhengchuanjie
 * @date 2021/5/13
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest运行啦！");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest运行啦!");
    }
}
