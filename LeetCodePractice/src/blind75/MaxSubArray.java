package blind75;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int num : nums) {
            if(sum<0) {
                sum = Math.max(sum, 0) + num;
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
