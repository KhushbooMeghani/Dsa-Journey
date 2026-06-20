//REVERSE OF AN ARRAY

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10, 3, 2, 16, 23 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
