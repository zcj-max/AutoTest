package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/17
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
    /**
     * 运行结果如下：
     *   这是服务端组运行之前运行的方法
         这是服务端组的测试方法11111
         这是服务端组的测试方法22222
         这是服务端组运行之后运行的方法
         这是客户端组运行之前运行的方法
         这是客户端组的测试方法33333
         这是客户端组的测试方法44444
         这是客户端组运行之后运行的方法
     */
}
