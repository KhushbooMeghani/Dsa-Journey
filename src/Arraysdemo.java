//SORT-ASCENDING ORDER 

import java.util.*;

public class Arraysdemo {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 7, 9, -2, 5, 6, 10 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // sort in ascending order
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
