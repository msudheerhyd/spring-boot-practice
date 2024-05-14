package blind75;

/* Input x = 121
Output : True
 */
public class isPalindromePractice {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;

        int reverse = 0, copy = x;

        while(copy > 0) {
            int digit = copy % 10;
            reverse = digit + reverse * 10;
            copy /= 10;
        }
        return reverse == x;
    }
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
