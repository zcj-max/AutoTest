package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/18
 */
public class DependTest {
    /*@Test
    public void login(){
        System.out.println("登录成功");
    }
    @Test(dependsOnMethods = "login")
    public void payTest(){
        System.out.println("开始支付");
    }

    运行结果如下：
    登录成功
    开始支付*/

    //如果被依赖的方法失败了，则依赖直接跳过，忽略掉
  @Test
    public void login(){
        System.out.println("登录成功");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = "login")
    public void payTest(){
        System.out.println("开始支付");
    }
    /**
     * 运行结果如下：
     * 登录成功

     java.lang.RuntimeException
     at com.course.testng.DependTest.login(DependTest.java:25)
     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     at java.lang.reflect.Method.invoke(Method.java:498)
     at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)
     at org.testng.internal.Invoker.invokeMethod(Invoker.java:645)
     at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)
     at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)
     at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)
     at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)
     at org.testng.TestRunner.privateRun(TestRunner.java:756)
     at org.testng.TestRunner.run(TestRunner.java:610)
     at org.testng.SuiteRunner.runTest(SuiteRunner.java:387)
     at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:382)
     at org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)
     at org.testng.SuiteRunner.run(SuiteRunner.java:289)
     at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
     at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
     at org.testng.TestNG.runSuitesSequentially(TestNG.java:1293)
     at org.testng.TestNG.runSuitesLocally(TestNG.java:1218)
     at org.testng.TestNG.runSuites(TestNG.java:1133)
     at org.testng.TestNG.run(TestNG.java:1104)
     at org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)
     at org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)


     Test ignored.

     ===============================================
     Default Suite
     Total tests run: 2, Failures: 1, Skips: 1
     */
}
