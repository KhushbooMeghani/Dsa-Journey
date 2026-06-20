import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 9, 7 };
        int n = arr.length;
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                arr[i]++;
                ans.add(arr[i] + carry);
                carry = 0;

            } else { // the number is 10
                ans.add(0);
                carry = 1;

            }
        }
        if (carry == 1) {
            ans.add(1);
            Collections.reverse(ans);
            System.out.println(ans);
        }

    }

}
