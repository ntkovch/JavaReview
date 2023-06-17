package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;

        if (loginButtonDisplayed && loginClickable) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        boolean pictureDisplayed=false;
        String accountName="Syntax";

        if(pictureDisplayed || accountName.equals("Syntax")){
            System.out.println("Login was successful");
        }else {
            System.out.println("User was not able to login");
        }

        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Bye";

        if(!str.equals("Hello")){
            System.out.println("Value of the String is NOT hello");
        }

        boolean confirmSelected=false;

        if(!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }
        System.out.println("Click on Pay button");
    }
}
