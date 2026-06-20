//input names in array and print them
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];
        System.out.println("enter the names");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }

    }

}
