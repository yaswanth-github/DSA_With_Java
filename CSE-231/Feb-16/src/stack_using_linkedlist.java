import java.util.*;

public class stack_using_linkedlist {
    LinkedList<Integer> stack = new LinkedList<Integer>();

    void push(int x) {
        stack.addFirst(x);
    }

    void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.removeFirst();
    }

    int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.getFirst();
    }

    int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        stack_using_linkedlist s = new stack_using_linkedlist();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println("1st element " + s.top());
        System.out.println("1st element poped");
        s.pop();
        System.out.println("2nd element " + s.top());
        System.out.println("2nd element poped");
        s.pop();
        System.out.println("3rd element " + s.top());

        System.out.println("current size: " + s.size());
    }
}
