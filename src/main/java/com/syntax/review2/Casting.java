package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        //byte->short->int->long->float->double
        //widening
        double d=19;
        System.out.println(d); //19.0

        //narrowing
        //double->float->long->int->short->byte

        int i=(int)19.9; //19
        System.out.println(i);

    }
}
