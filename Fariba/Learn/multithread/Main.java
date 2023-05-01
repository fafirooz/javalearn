package Fariba.Learn.multithread;

public class Main {  // نحوه اجرای برنامه
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("dfdf");
            }
        });

        thread2.start();

        System.out.println("fddffdg");
        System.out.println("fddffdg");
        System.out.println("fddffdg");
        System.out.println("fddffdg");

    }
}
// Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Threads can be used to perform complicated tasks in the background without interrupting the main program.
// There are two ways to create a thread.
// It can be created by extending the Thread class and overriding its run() method:
// public class Main extends Thread {
/* public void run() {
    System.out.println("This code is running in a thread");
  }
} */
// Another way to create a thread is to implement the Runnable interface:
/*
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
 */

