package blind75;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums){
        if(nums.length == 0) return new ArrayList<>();

        List<String> ranges = new ArrayList<>();
        int start = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                ranges.add(encodeRange(start, nums[i]));

                if(i != nums.length - 1) start = nums[i + 1];
            }
        }
        return ranges;
    }

    private static String encodeRange(int start, int end) {
        StringBuilder range = new StringBuilder();

        if(start == end) {
            range.append(start);
        } else {
            range.append(start)
                    .append("->")
                    .append(end);
        }

        return range.toString();
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
