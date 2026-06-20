import java.util.*;

public class concatenate {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 1 };
        int n = nums.length;
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}