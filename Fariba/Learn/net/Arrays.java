package Fariba.Learn.net;

public class Arrays {
    public static void main(String[] args) {
        int[] events = new int[5];
        events[0] = 0;
        events[1] = 2;
        events[2] = 4;
        events[3] = 6;
        events[4] = 8;

        int[] adds = {1, 3, 5, 7, 9};

        for (int i = 0; i < events.length; i= i+1) {

            System.out.println(events[i]);
            System.out.println(adds[i]);


        }


    }
}
