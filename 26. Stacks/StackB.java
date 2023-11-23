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

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>(); // stack created of integer type
        span[0] = 1; // 0'th stock is always 1
        s.push(0); // 0'th stock is pushed into stack

        for (int i = 1; i < span.length; i++) { // loop will calculate span for each day & 0'th day we have already
                                                // calculated so we will start i=1
            int currPrice = stocks[i]; // To calculate span first we will calculate current price
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) { // comparing current price with previous prices
                s.pop(); // removing previous smaller price stocks than currPrice stock
            }
            if (s.isEmpty()) { // while removing smaller elements checking whether stack is empty or not
                span[i] = i + 1;
            } else { // if it doesn't happen then...
                int prevHigh = s.peek(); // previous high will the top element of stack
                span[i] = i - prevHigh; // here we will get value of span
            }

            s.push(i); // value of span will be pused into the stack
        }
    }

    public static void main(String args[]) {

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);
        // printStack(s);

        // String str = "HelloWorld";
        // System.out.println(reverseString(str));

        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 }; // Stocks array created...
        int span[] = new int[stocks.length]; // Span array created of same length as stocks...
        stockSpan(stocks, span); // Function is called...

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " "); // stack value will be printed.
        }

    }
}