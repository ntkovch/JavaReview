package com.syntax.review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many integers you want to store");
        int size=scan.nextInt();
        int [] numbers=new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter "+(i+1)+" element");
            numbers[i]=scan.nextInt();
        }
    }
}
