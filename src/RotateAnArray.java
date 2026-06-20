//ROTATE AN ARRAY

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10, 3, 2, 16, 23 };

        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
