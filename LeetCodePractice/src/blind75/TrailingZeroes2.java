package blind75;

public class TrailingZeroes2 {

    public static int trailingZeroes(int n) {
        int sum = 1;

        for(int i=1; i<=n; i++) {
            sum = sum * i;
        }

        int noOfZeroes = 0;

        while(sum > 0) {
            int remainder = sum % 10;
            if(remainder == 0) {
                noOfZeroes += 1;
                sum /= 10;
            }
            else break;
        }
        return noOfZeroes;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
    }
}
