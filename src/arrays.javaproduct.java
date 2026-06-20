
//print product of array elements
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
        int product = 1;
        for (int i = 0; i < size; i++) {
            product = product * numbers[i];
            System.out.println(product);

        }
    }

}
