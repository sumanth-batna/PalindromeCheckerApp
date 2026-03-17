public class PalindromeCheckerApp {

    // 1️⃣ Two-pointer method
    public static boolean twoPointer(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // 2️⃣ Stack method
    public static boolean stackMethod(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : str.toCharArray()) stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // 3️⃣ Deque method
    public static boolean dequeMethod(String str) {
        java.util.Deque<Character> dq = new java.util.ArrayDeque<>();
        for (char c : str.toCharArray()) dq.add(c);

        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) return false;
        }
        return true;
    }

    // 4️⃣ Recursive method
    public static boolean recursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama"
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        // Two-pointer timing
        long start = System.nanoTime();
        boolean res1 = twoPointer(str);
        long end = System.nanoTime();
        System.out.println("TwoPointer: " + res1 + " Time: " + (end - start));

        // Stack timing
        start = System.nanoTime();
        boolean res2 = stackMethod(str);
        end = System.nanoTime();
        System.out.println("Stack: " + res2 + " Time: " + (end - start));

        // Deque timing
        start = System.nanoTime();
        boolean res3 = dequeMethod(str);
        end = System.nanoTime();
        System.out.println("Deque: " + res3 + " Time: " + (end - start));

        // Recursive timing
        start = System.nanoTime();
        boolean res4 = recursive(str, 0, str.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive: " + res4 + " Time: " + (end - start));
    }
}