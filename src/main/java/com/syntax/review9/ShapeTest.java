package com.syntax.review9;

public class ShapeTest {
    public static final String str="Hello";
    public static void main(String[] args) {
        Triangle tr=new Triangle("triangle","purple",12,18);
        tr.print();
        tr.calculateArea();
        System.out.println("area = "+tr.calculateArea());
        System.out.println("------------------------------");
        Rectangle rec=new Rectangle("rectangle","green",10,20);
        rec.printInfo();
        System.out.println("Area of rectangle = "+rec.calculateArea());

        Shape shape=new Triangle("triangle","red",120,180);
        shape.printInfo();
        System.out.println(shape.calculateArea());
        System.out.println("***********************************************************");

        Shape[] bigShape={new Triangle("triangle","pink",200,300),
                          new Rectangle("rectangle","blue",10,200),
                new Rectangle("rectangle","brown",100,200)};
        for(Shape sh:bigShape){
            sh.printInfo();
            double area=sh.calculateArea();
            System.out.println("The area of "+sh.color+" "+sh.type+" = "+area);
        }

    }
}
