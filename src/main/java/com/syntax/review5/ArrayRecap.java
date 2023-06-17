package com.syntax.review5;

public class ArrayRecap {
    public static void main(String[] args) {
        String [] languages={"English", "Ukrainian", "Turkish", "French", "Spanish"};
        for (String language : languages) {
            System.out.print(language+" ");
        }
        System.out.println();
        System.out.println("--------  REVERSE  --------");
        for (int i = languages.length-1; i >=0; i--) {
            System.out.print(languages[i]+" ");
        }
    }
}
