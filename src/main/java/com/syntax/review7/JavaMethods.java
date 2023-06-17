package com.syntax.review7;

public class JavaMethods {
    void hello(){
        System.out.println("Hello");
    }

    void helloName(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        jm.hello();
        jm.helloName("hgf");

    }

}
