package Fariba.Learn.objectoriented.inheritance.Object.after;

import Fariba.Learn.objectoriented.Interface.InterfaceWriteable;

public class Circle extends Object implements InterfaceWriteable { // inheritance- Sub class- drivate class

    public int shoa;
    public static int k;

    public Circle() {
        color = "green";
        shoa = 3;
    }

    public Circle(String color1) {
        color = color1;
    }

    // Overloading
    public Circle(int shoa1, String color1) {
        shoa = shoa1;
        color = color1;
    }

    public int area() {
        return  shoa * 2;
    }

    public int mohit() {
        return shoa * 3;
    }

    @Override // annotation
    public void print() {
        System.out.println("hjhjkh" + color);
        System.out.println(k);
    }

    public static void print2() {aa
        System.out.println(k);
       // System.out.println(color);
    }

    @Override
    public void write(String text) {

    }
}



