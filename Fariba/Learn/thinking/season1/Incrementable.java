package Fariba.Learn.thinking.season1;



public class Incrementable{
    int i = 47;
    public static void increment(){
        StaticTest.i++;
    }
    public static void main(String[]args){

        Incrementable incrementable = new Incrementable();
        Incrementable.increment();
        System.out.println(StaticTest.i);

    }
}



