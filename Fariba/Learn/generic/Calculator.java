package Fariba.Learn.generic;

import java.util.Date;

public class Calculator<T extends Number> { //T = generic type

    private T a;
    private T b;

    public Calculator(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T sum() {
        Double i = a.doubleValue() + b.doubleValue();
        return (T) i;

    }

    public static <T extends Number> T sum2(T a, T b) {
        Double i = a.doubleValue() + b.doubleValue();
        return (T) i;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>(2, 2);
        System.out.println(calculator.sum());

        Calculator<Long> calculator1 = new Calculator<>(4l, 6l);
        System.out.println(calculator1.sum());

        Calculator calculator2 = new Calculator<>(4, 4.5);
        System.out.println(calculator2.sum());


    }
}