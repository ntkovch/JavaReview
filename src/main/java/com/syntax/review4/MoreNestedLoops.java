package com.syntax.review4;

public class MoreNestedLoops {
    public static void main(String[] args) {
        System.out.println("-----------CAR--------------");

        for (int i = 0; i <=9; i++) {

            for (int j = 0; j <=9; j++) {

                for (int k = 0; k <=9; k++) {
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
        System.out.println("What is the output??????");
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==2){
                    continue;
                }
                System.out.println("Hello");
            }

            System.out.println("Buy");
            }


    }
}
