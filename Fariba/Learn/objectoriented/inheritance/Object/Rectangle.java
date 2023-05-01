package Fariba.Learn.objectoriented.inheritance.Object;

public class Rectangle {
    private int length;
    private int weight;
    private String color;

    public Rectangle(int length1, int weight1, String color1) {
        length = length1;
        weight = weight1;
        color = color1;
    }

    public int area() {
        return length * weight;
    }

    public int mohit() {
        return 2 * (length + weight);
    }

    public void print() {
        System.out.println(color);
    }
}
