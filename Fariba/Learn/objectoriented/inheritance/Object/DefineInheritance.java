package Fariba.Learn.objectoriented.inheritance.Object;

public class DefineInheritance {
}
// In Java, it is possible to inherit attributes and methods from one class to another.
// subclass (child) - superclass (parent)
// To inherit from a class, use the extends keyword.
// Inheritance is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
// Inheritance is also, Polymorphism, which uses inherited methods to perform different tasks.
//


/* class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute - protected + public + private = سطح دسترسی access modifier
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
// We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

// The final Keyword = If you don't want other classes to inherit from a class, use the final keyword
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
} */
