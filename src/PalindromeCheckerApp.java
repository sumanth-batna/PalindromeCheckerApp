import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}