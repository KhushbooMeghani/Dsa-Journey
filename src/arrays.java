//ROTATE AN ARRAY

import java.util.*;
import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        int candies[] = { 1, 3, 4, 5, 6, 4 };
        int extraCandies = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        System.out.println(result);

    }

}
