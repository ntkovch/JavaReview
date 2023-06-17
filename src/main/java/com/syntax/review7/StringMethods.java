package com.syntax.review7;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";
        String str2=new String("Hello");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        str.toUpperCase();
        System.out.println(str);

        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);

        sb.append("Hello");
        str=sb.toString();
        System.out.println(str);

        String given="Class";
        StringBuilder strb=new StringBuilder(given);
        given=strb.reverse().toString();
        System.out.println(given);
        given="Class";

        System.out.println("---------------------------------------------");

        for (int i = given.length()-1; i >= 0; i--) {
            System.out.print(given.charAt(i));
        }


    }
}
