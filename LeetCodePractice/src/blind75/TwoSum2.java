package blind75;

import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum2(int[] nums, int target) {
        int i = 0, j = nums.length-1;

        while(i<j) {
            int sum = nums[i] + nums[j];

            if(sum == target) {
                return new int[] {i+1, j+1};
            }
            else if(sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 10};
        int target = 18;

        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }
}
