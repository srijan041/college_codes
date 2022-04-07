
class StackException extends Exception {
    StackException(String s) {
        super(s);
    }
}

public class Stack {
    int size = 0;
    int top = 0;
    int data[];

    Stack(int s) {
        size = s;
        data = new int[size];
    }

    void push(int d) throws StackException {
        if (top == size) {
            throw new StackException("Stack Full");
        }
        data[top++] = d;
    }

    int pop() throws StackException {
        if (top == 0) {
            throw new StackException("Stack empty");
        }
        return data[--top];
    }

    public static void main(String[] args) throws StackException {
        try {

            Stack s = new Stack(5);
            for (int i = 0; i < 5; i++)
                s.push(i);

            // s.push(10);
            for (int i = 0; i < 6; i++)
                System.out.println(s.pop());

        } catch (

        StackException e) {
            System.out.println(e);
        }
    }
}
