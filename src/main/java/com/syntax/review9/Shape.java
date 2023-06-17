package com.syntax.review9;
interface Drawable {
    boolean DRAW=true;
    void drawing();
}
public abstract class Shape {
   public String type;
   protected String color;
   Shape (String type,String color){
        this.type=type;
        this.color=color;
    }
    protected void printInfo(){
        System.out.println("We build "+color+" "+type);
    }
    public abstract double calculateArea();
}
class Triangle extends Shape {
    int base;
    int hight;
    Triangle(String type, String color,int base, int hight) {
        super(type, color);
        this.base=base;
        this.hight=hight;
    }

    @Override
    public double calculateArea() {
        double area=0.5*base*hight;
        return area;
    }
    public void print(){
        System.out.println(type+" has demension as "+base+" "+hight);
    }
}
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String type, String color,double length,  double width ) {
        super(type, color);
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
