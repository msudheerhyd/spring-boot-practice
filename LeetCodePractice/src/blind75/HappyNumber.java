package blind75;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int slow = n, fast = n;

        while(slow != 1) {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));

            if(slow == fast) break;
        }

        return slow == 1;
    }

    private static int sumOfSquareOfDigits(int x) {
        int sum = 0;

        while(x > 0) {
            int d = x % 10;
            sum += (d * d);
            x /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
