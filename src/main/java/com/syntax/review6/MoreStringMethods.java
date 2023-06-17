package com.syntax.review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String day="Thursday";
        char character=day.charAt(2);
        System.out.println(character);
        int index=day.indexOf('s');
        int anotherIndex=day.indexOf("day");
        System.out.println(anotherIndex);

        System.out.println(index);
        System.out.println("-------- SPLIT --------");
        String food="I like indian food";
        String [] words=food.split(" ");
        for (String s : words) {
            System.out.print(s+" ");
        }


    }
}
