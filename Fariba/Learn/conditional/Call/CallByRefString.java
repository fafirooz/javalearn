package Fariba.Learn.conditional.Call;

public class CallByRefString {

    // pass an object of StringBuilder as a parameter
    public static void change(StringBuilder s) {
        s.append(" world!"); // add word in s
            /* Append in Java is a StringBuilder and StringBuffer class method
            used to append a value to the current sequence.  */
        System.out.println("value in method: " + s.toString());
    }
    //The toString() method returns the String representation of the object.

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");

        System.out.println("value before method call: " + s.toString());
        change(s);
        System.out.println("value after method call: " + s.toString());

    }
}

