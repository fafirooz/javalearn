package Fariba.Learn.net;

public class Days {

    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "sunday";
        days[1] = "monday";
        days[2] = "tuesday";
        days[3] = "wednesday";
        days[4] = "thursday";
        days[5] = "friday";
        days[6] = "saturday";

        //String[] days= {"sunday,monday, tuesday,wednesday, thursday,friday,saturday"};


        System.out.println(days.length);
        System.out.println(days[days.length - 1]);
        System.out.println(days[days.length - 3]);

    }
}


