package blind75;

public class isPalindrome {

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int reverse = 0, copy = x;

        while(copy > 0) {
            int digit = copy % 10;
            reverse = digit + reverse * 10;
            copy = copy / 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
