import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both queue and stack
        for (char c : str.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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