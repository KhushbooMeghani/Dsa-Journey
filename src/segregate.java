import java.util.*;

public class segregate {
    public static void main(String[] args) {

        int arr[] = { 1, -2, -3, 5, 6, 8, -5 };
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;

            } else if (arr[j] > 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
