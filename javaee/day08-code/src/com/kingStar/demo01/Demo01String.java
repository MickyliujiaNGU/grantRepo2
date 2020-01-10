package com.kingStar.demo01;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);
        byte[]  byteArray=new byte[]{97,98,99};
        String str2 = new String(byteArray);
        System.out.println(str2);
        char[] chars = {'A', 'B', 'C'};
        String str3 = new String(chars);
        System.out.println(str3);
        String str4="string";
        System.out.println(str4);
    }
}
