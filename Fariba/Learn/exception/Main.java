package Fariba.Learn.exception;

import java.io.IOException;

public class Main {

    public static int divide(int a, int b) throws IOException {
        if (b == 0)
            throw new IOException("divide by zsrooooooo");
        return a / b;
    }

    public static void main(String[] args) throws IOException {
        //  try {
        System.out.println(divide(4, 0));
    }
          //catch(Exception e);

    {
        System.out.println("exception happened,");
        //    e.printStackTrace();
    }
}
