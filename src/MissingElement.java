//MISSING ELEMENT IN AN ARRAY

import java.util.*;

public class missing {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 6, 5, 4 };
        int n = arr.length + 1;
        int exsum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        if (exsum != sum) {
            System.out.println("missing number");
            System.out.println(exsum - sum);
        }
    }

}
