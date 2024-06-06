package blind75;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i=0;

        for(int j=0; j<nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 4};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
