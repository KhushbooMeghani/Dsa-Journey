//deep copy in java

import java.util.*;

public class arrays {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40 };
        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 100;

        System.out.println(arr[0]);
        System.out.println(y[0]);

    }
}
