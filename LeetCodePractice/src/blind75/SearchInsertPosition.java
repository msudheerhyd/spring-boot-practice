package blind75;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left<right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if(target < nums[left]) {
            return left;
        }
        else {
            return left+1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 7, 10};
        int target = 8;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }
}
