import java.util.*;

public class StackB {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Using recursion method.
        if (s.isEmpty()) { // checking whether stack is empty or not.
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }

        return sb.toString();
    }

    public static void main(String args[]) {

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        String str = "HelloWorld";
        System.out.println(reverseString(str));

    }
}