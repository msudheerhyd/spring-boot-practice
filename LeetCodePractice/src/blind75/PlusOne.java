package blind75;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        List <Integer> result = new LinkedList<>();
        int carry = 1;

        for(int i=digits.length-1; i>=0; i--) {
            int sum = digits [i] + carry;
            carry = (sum > 9) ? 1 : 0;
            result.add(0, sum%10);
        }
        if(carry>0) result.add(0, 1);
        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] digits = {5, 8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
