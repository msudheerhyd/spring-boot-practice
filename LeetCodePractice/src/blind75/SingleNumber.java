package blind75;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int x : nums) {
            result = result ^ x;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(singleNumber(nums));
    }
}
