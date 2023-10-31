import java.util.ArrayList;

public class StackB {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty Function
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push Operation
        public static void push(int data) {
            list.add(data);
        }

        // Pop Operation
        public static int pop() {
            // Cornor Case
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}