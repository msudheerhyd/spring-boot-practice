package blind75;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j=0; j<nums.length; j++) {
            if (map.containsKey(nums[j]) && j-map.get(nums[j]) <=k) return true;
            map.put(nums[j], j);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
