package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zhengchuanjie
 * @date 2021/5/18
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name, int age) {
        System.out.println("name:" + name + "  age:" + age);


    }
}
