package blind75;

public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j=0; j<nums.length; j++) {
            i = i + 1;

            while(j<nums.length-1 && nums[j] == nums[j+1]){
               j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
    }
}

