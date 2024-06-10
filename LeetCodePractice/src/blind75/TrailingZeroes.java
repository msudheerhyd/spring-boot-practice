package blind75;

public class TrailingZeroes {

    public static int trailingZeroes(int n){
        int sum = 1;
        for(int i=1; i<=n; i++) {
            sum = sum * i;
        }
        int zeroes = 0;

        while(sum > 0) {
            int remainder = sum % 10;
            if(remainder == 0) {
                zeroes += 1;
                sum = sum / 10;
            }
            else break;
        }
        return zeroes;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(trailingZeroes(n));
    }
}
