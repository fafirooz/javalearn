package Fariba.Learn.conditional;

import java.util.Date;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner in = new Scanner(System.in); // declare = تعریف کردن = فراخواندن

        System.out.print("Input a number: "); // call = صدا زدن
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));
        }
    }

}

