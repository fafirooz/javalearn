package Fariba.Learn.objectoriented.composition;

public class Door {
    private Handler handler; // composition - has a ...

    public void som() {
        handler.print() ;
    }
}

// A composition in Java between two objects associated with each other exists when there is a strong relationship
// between one class and another. Other classes cannot exist without the owner or parent class. For example,
// A ‘Human’ class is a composition of Heart and lungs. When the human object dies, nobody parts exist.

// In this program, the class Honda is a Car and extends from the class Car.
// The car engine Object is used in the Honda class.
