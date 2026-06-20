import java.util.*;

public class MergeTwoSortedArrays1 {
    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 9, 100 };
        int b[] = { 1, 3, 4, 5, 7, 8, 20, 30 };
        int c[] = new int[a.length + b.length];
        int i = a.length - 1;
        int j = b.length - 1;
        int k = c.length - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
                k--;

            } else {
                c[k] = b[j];
                j--;
                k--;
            }
        }

        while (j >= 0) {
            c[k] = b[j];
            j--;
            k--;

        }

        while (i >= 0) {
            c[k] = a[i];
            i--;
            k--;

        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }

}
