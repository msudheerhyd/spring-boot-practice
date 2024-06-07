package blind75;

public class SearchIndex2 {

    public static int searchIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left < right) {
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

        return nums[left] < target ? left+1 : left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchIndex(nums, target));
    }
}
