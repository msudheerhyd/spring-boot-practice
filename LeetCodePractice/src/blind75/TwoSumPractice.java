package blind75;

import java.util.*;

public class TwoSumPractice {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer[]> myList = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                myList.add(new Integer[] {map.get(target-nums[i]), i});
            }
            map.put(nums[i], i);
        }
        for(int i=0; i<myList.size(); i++) {
            System.out.println(Arrays.toString(myList.get(i)));
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}
