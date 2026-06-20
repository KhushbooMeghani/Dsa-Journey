import java.util.*;

public class Sort0And1And2 {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 2, 0, 2, 2, 0 };
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count0) {
                arr[i] = 0;
            } else if (i < count0 + count1) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
