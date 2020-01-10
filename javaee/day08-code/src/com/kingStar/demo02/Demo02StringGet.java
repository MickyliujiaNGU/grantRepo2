package com.kingStar.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        System.out.println("asdfs".length());
        String str1="hello";
        String str2="java";
        System.out.println(str1.concat(str2));
        int i = str1.indexOf(12);
        System.out.println(i);
        int o = str1.indexOf("o");
        System.out.println(o);
        System.out.println(str1.charAt(2));
    }
}
