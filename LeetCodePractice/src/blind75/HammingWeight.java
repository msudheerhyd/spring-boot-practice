package blind75;

public class HammingWeight {

    public static int hammingWeight(int n) {
        int ones = 0;

        while(n != 0) {
            n = n & (n-1);
            ones++;
        }
        return ones;
    }

    public static void main(String[] args) {
        //int n = 001010010110010010100110010110010;
        //System.out.println(hammingWeight(n));
    }
}
