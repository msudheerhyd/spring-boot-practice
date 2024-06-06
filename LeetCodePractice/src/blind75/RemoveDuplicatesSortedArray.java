package blind75;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j=0; j<nums.length; j++) {
            nums[i++] = nums[j];

            while(j!=nums.length-1 && nums[j+1] == nums[j]) {
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
