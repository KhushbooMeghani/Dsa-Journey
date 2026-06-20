public class RuningSumOf1Darray {
    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4 };
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
