package com.kingstar.demo01;

import com.kingstar.demo05.Person;

public class TestObjectToString {
    public static void main(String[] args) {
        Person one = new Person("liujia", 14);
        Person two = new Person("liujia1", 18);
        System.out.println(one);
        System.out.println(one.hashCode());
    }
}
