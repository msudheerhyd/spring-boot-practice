package blind75;

public class RemoveDuplicatesArray2 {

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j=0; j<nums.length; j++) {
            i = i+1;

            while(j<nums.length-1 && nums[j] == nums[j+1]) {
                j = j+1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 4, 5, 6};
        System.out.println(removeDuplicates(nums));
    }
}
