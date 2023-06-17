package com.syntax.review12;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E7InterviewQuestion {
    public static void main(String[] args) {
        int [] arr={10,20,10,30,40,50,20,30,70,80,70};
        Map<Integer,Integer> map=new TreeMap<>();


        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                int num1=arr[j];
                if(num==num1){
                    count++;
                }

            }
            map.put(num,count);
        }
        map.forEach((key,value)->{
            System.out.println(key+","+value);
        });
    }
}
