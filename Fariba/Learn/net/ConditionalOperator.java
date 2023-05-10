package Fariba.Learn.net;

public class ConditionalOperator {
    public static void main(String[] args) {
        char status; // a is adult and m is minor!
        int age = 16;
        if (age >= 18) {
            status = 'a';

        } else {
            status = 'b';
        }
        System.out.println(status);

        status = age >= 16 ? 'b' : 'a'; //conditional operator can replace with if.
        System.out.println(status);
    }
}

