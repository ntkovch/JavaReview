package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {
        int aa=10;
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=11;

        System.out.println(arr[1]);

        for(int a:arr){
            System.out.println(a);
        };

        String [] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }
        System.out.println("-------- Enhanced for loop --------");
        for(String planet:planets){
            System.out.println(planet);
        }
    }
}
