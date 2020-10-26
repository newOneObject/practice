package com.example.demo.jvm;

/**
 * @Author: Geekery
 * @Date: 2020/10/13 15:01
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println(Test.class.getName());
        Class<?> aClass = Class.forName(Test.class.getName());
        Test test = (Test)aClass.newInstance();
        test= test.staticMethod("this");

    }
}
