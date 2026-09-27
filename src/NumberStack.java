public class NumberStack {

    private double[] stack;
    private int top;

    public NumberStack(int size) {
        stack = new double[size];
        top = -1;
    }

    public void push(double value) {

        if (top == stack.length - 1) {
            System.out.println("Stack overflow.");
            return;
        }

        top++;
        stack[top] = value;
    }

    public double pop() {

        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return 0;
        }

        double value = stack[top];
        top--;

        return value;
    }

    public double peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0;
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void displayStack() {

        System.out.print("Stack: [ ");

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println("]");
    }
} 