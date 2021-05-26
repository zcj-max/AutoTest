package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author zhengchuanjie
 * @date 2021/5/19
 */
public class DataProviderTest {

    /*public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        for (int i : a
                ) {
            System.out.println(i);
        }
    }*/
    @Test(dataProvider = "Data")
    public void test0(String name, int age) {
        System.out.println("name=" + name + ";  age=" + age);
    }

    @DataProvider(name = "Data")
    public Object[][] dataProvider() {
        Object[][] o = new Object[][]{{"zhangshan", 10}, {"lisi", 20}};
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1方法 name = " + name + "; age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2方法 name = " + name + "; age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] getData(Method method) {
        Object[][] o = null;
        if (method.getName().equals("test1")) {
            o = new Object[][]{{"zhangshan", 10}, {"lisi", 20}};
        }
        if (method.getName().equals("test2")) {
            o = new Object[][]{{"wangwu", 20}, {"zhaoliu", 40}};
        }
        return o;
    }
}
