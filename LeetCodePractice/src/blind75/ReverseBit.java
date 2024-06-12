package blind75;

public class ReverseBit {

    public static int reverseBit(int n) {
        int reverse = 0;

        for(int i=0; i<32; i++) {
            int bit = n & 1;
            n >>= 1;
            reverse |= bit;

            if(i < 31) reverse <<= 1;
        }
        return reverse;
    }

    public static void main(String[] args) {
        //int n = 00000010100101000001111010011100;
        //System.out.println(reverseBit(n));
    }
}
