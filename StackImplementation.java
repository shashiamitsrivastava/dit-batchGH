import java.util.ArrayList;
import java.util.Scanner;

class Stack<T> {

    ArrayList<T> arr;
    int capacity;
    int top;

    Stack(int capacity) {
        top = -1;
        this.capacity = capacity;
        arr = new ArrayList<>(capacity);
    }

    public void push(T element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack Full");
        }
        top++;
        arr.add(top, element);
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }

        T element = arr.remove(top);
        top--;
        return element;
    }

    public T peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }

        return arr.get(top);

    }
}

public class StackImplementation {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(5);
        System.out.println(stack.peek());
    }
}
