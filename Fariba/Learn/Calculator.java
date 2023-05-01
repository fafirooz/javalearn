package Fariba.Learn;

public class Calculator {
    public static void main ( String[] args) {
        int result = sum(10, 5);
        int result2 = subtract(result, 4);
        System.out.println(result2);

    }

    public static int sum( int num1 , int num2 ) {
        return num1 + num2;
    }

    public static int subtract(int b, int c) {

        return b - c;
    }
}

