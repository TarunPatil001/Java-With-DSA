import java.util.*;

public class StackB {

    // static class Node {
    // int data;
    // Node next;

    // public Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // static class Stack {
    // static Node head = null;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // public static void push(int data) {
    // Node newNode = new Node(data); // created Node

    // if (isEmpty()) { // Checking whether the stack is empty or not.
    // head = newNode; // Assigning newNode as head.
    // return;
    // }

    // newNode.next = head;
    // head = newNode;
    // }

    // public static int pop() {
    // if (isEmpty()) { // Checking whether the stack is empty or not.
    // return -1;
    // }

    // int top = head.data;
    // head = head.next; // Assigning head to next element. Next element is
    // head.next.
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }

    // return head.data;
    // }

    // }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}