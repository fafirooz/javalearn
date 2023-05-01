package Fariba.Learn.objectoriented.Interface;

public class Pen implements InterfaceWriteable {

    private String color; // color + high = attribute- property- field - ویژگی
    private int high;

    public Pen(String color1, int high1) { // constructed - method - procedure - رفتار
        color = color1;
        high = high1;
    }

    @Override
    public void write(String text) { // void = without return - رفتار
        System.out.println("write in color of: "+ color + ", text is: " + text);// encapsulation
    }

/*    public boolean makeUsable() {
        return false;
    }*/
}
