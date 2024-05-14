package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0; i< nums.length; i++ ){
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(i, nums[i]);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 1};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
