package Fariba.Learn.datastructure;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[60];

       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1) * 10;
        }*/

        arr[0] = 10;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[5] = 0;
    }

    public int searchArray(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
    }
}
