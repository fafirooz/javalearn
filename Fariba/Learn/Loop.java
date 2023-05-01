package Fariba.Learn;

public class Loop { // scope = body
    public static void main (String [] args) { //signature - Void = without return

        int var1; // declaration - blue text = key word
        var1 = 5; // initialization

        System.out.println(var1); // purple text = object - encapsulation

        int var = 10; // int = Data type- var = variable - 10 = literal
        String str = "dfgdfsgdfgh"; // "dfgdfsgdfgh" = literal

        // for- you know how many times it's occurs
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println (i);
        }

        // like for
        int i = 0;
        while (i < 5) { // condition = i < 5
            System.out.println("this ok");
            i = i + 1; // increment- Decrement
        }

        while (true) { //you don't know how many times it's occurs
            System.out.println("inside while");

            if (true)
                break; // Stop Processing totally

            if (true)
                continue; // Stop Processing too but it returns to one step before
            System.out.println("fddf");
            System.out.println("fgfgf");
        }

        do { // at least run once, the body
            System.out.println("fdf");
        } while (false);
    }
 }

