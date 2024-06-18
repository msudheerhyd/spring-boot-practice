package blind75;

public class IsPowerOfTwo2 {

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}
