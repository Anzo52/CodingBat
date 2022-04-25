public class Sum67 {
    public static int sum67(int[] nums) {
        // return sum except nums between "6" and "7"
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 6 && nums[i] != 7) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }
}