import java.util.Stack;
public class Code {
    static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }
        public void push(int value) {
            stack.push(value);
            if (minStack.isEmpty() || value <= minStack.peek()) {
                minStack.push(value);
            }
        }
        public void pop() {
            if (!stack.isEmpty()) {
                if (stack.peek().equals(minStack.peek())) {
                    minStack.pop();
                }
                stack.pop();
            }
        }
        public int top() {
            return stack.peek();
        }
        public int getMin() {
            return minStack.peek();
        }
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin()); // -3
        obj.pop();
        System.out.println(obj.top());    // 0
        System.out.println(obj.getMin()); // -2
    }
}