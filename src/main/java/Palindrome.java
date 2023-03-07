import java.util.*;

public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str) {
        Deque<Character> reverseStr = new LinkedList<>();

        for(int index = str.length() - 1; index >= 0; --index) {
            reverseStr.add(str.charAt(index));
        }

        for(int idx = 0; idx < str.length(); ++idx) {
            if(reverseStr.peek() != str.charAt(idx)) {
                return false;
            }

            reverseStr.pollFirst();
        }

        return true;
    }
}
