package blind75;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count = 0, majority = 0;

        for(int num : nums) {
            if(count == 0) {
                majority = num;
                count = 1;
                continue;
            }
            count = (num == majority) ? count+1 : count-1;
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
