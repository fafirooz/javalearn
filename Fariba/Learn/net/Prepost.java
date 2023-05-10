package Fariba.Learn.net;

public class Prepost {
    public static void main(String[] args) {
        int a= 0;
        int b= 0;
        a= b++;
        System.out.println(" a is: " + a + " b is " + b);


        a= 0;
        b= 0;
        a= ++b;
        System.out.println(" a is: " + a + " b is " + b);
    }
}
