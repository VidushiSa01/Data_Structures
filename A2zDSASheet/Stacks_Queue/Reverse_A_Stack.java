import java.util.*;

public class Source {
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }

    Node top;

    // Push and pop operations
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;


        }
    }

    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {

        // Write your code here.
        Node prev = null;
        Node current = top;
        Node next = null;

        while (current != null) {
            // Store next node
            next = current.next;

            // Reverse current node's pointer
            current.next = prev;

            // Move pointers one position ahead
            prev = current;
            current = next;
        }

        // New top of the stack is the previous node
        top = prev;

        return top;
    }
    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                obj.push(in.next().charAt(0));
            }

            obj.display(obj.top);
            System.out.println(" ");
            // reverse
            Node temp = obj.reverse();
            obj.display(temp);
        } else {
            System.out.println("the stack is empty");
        }
    }

}
