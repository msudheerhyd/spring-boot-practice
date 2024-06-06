package blind75;

public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        s = s.toLowerCase();

        while(i < j) {
            char c = s.charAt(i), d = s.charAt(j);
            if(!isValidDigitCharacter(c)) {
                i++;
                continue;
            }
            if(!isValidDigitCharacter(d)) {
                j--;
                continue;
            }
            if(c!=d) return false;

            i++;
            j--;
        }
        return true;
    }

    private static boolean isValidDigitCharacter(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal : Panama";
        System.out.println(validPalindrome(s));
    }
}
