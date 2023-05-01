package Fariba.Learn.conditional;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in); // declare = تعریف کردن = فراخواندن

        System.out.print("Input a number: "); // call = صدا زدن
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));
        }
    }

}

