package Fariba.Learn.objectoriented.inheritance.Object;

public class Circle {

    private int shoa;
    private String color;

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

    public void print() {
        System.out.println(color);
    }
}
