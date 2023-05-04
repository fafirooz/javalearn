package Fariba.Learn.objectoriented.wrapper;

import java.util.ArrayList;

public class Wrapper {

    public static void main(String[] args) {

        ArrayList<Long> a = new ArrayList<>();
        a.add(4L);
        a.add(Long.valueOf(4L));
        Long result = a.get(0);
        long w = result.longValue();
    }
}
