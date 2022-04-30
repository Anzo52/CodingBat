public class Sum67 {
    public static int sum67(int[] nums) {
        // return sum except nums between "6" and "7"
        int sum = 0;
        boolean not7 = false;
        
        for (int n : nums) {
            if (n == 6) not7 = true;
            if (!not7) sum += n;
            if (not7 && n == 7) not7 = false;
        }
        return sum;
    }
}
