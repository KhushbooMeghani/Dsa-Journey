//print smallest/minimum number in an array

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of aaray:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (numbers[i] < max) {
                max = numbers[i];

            }
            System.out.println(max);

        }
    }

}
