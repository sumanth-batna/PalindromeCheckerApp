import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";

        LinkedList<Character> list = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to LinkedList and Stack
        for (char c : str.toCharArray()) {
            list.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare LinkedList (forward) with Stack (reverse)
        for (char c : list) {
            if (c != stack.pop()) {
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