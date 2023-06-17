package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter integer values");
        int sum=0;

        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum = "+sum);




    }
}
