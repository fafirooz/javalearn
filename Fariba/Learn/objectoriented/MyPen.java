package Fariba.Learn.objectoriented;

import Fariba.Learn.objectoriented.Interface.Pen;

public class MyPen {
    public static void main(String[] args) {
        Pen myPen = new Pen("green", 10); // new for make obj of class.
     //   System.out.println(myPen.color);
     //   System.out.println(myPen.high);

     //   myPen.write("first object");

        Pen myPen2 = new Pen("red", 10);
        myPen2.write("first object");
    }
}
