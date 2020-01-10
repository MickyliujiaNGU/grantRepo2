package com.kingStar.demo02;

public class Demo02StringEqual {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] charArray={'h','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str2.equals(str3));
    }
}
