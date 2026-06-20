
import java.util.*;

public class secondmaximum {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10, 10, 2 };
        // approach
        // find maximum number from array using one for loop
        // then find second max number from array using same condition as above but use
        // condition,
        // that arr[i]!=max
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(smax);
    }

}
