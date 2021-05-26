package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/18
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu11111111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu22222222运行");
    }
}
