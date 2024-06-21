package blind75;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        return Arrays.equals(getFrequency(s), getFrequency(t));
    }

    public static int[] getFrequency(String s) {

        int[] count = new int[26];

        for(int i=0; i<s.length();i++) {
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "sunil";
        String t = "linus";
        System.out.println(validAnagram(s, t));
    }
}
