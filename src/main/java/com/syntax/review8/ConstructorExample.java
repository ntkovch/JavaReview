package com.syntax.review8;

public class ConstructorExample {
    ConstructorExample(){
        System.out.println("I created this constructor");
    }
    ConstructorExample(String str){
        System.out.println("I am parametrized constructor "+str);
    }

    public static void main(String[] args) {
        new ConstructorExample();
        new ConstructorExample("Hello");
    }
}
