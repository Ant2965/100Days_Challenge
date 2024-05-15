
//package stack;
import java.util.Stack;

public class Pushatbottom {

    public static void bottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop(); // stores the value for tthe return call;

        bottom(s, data);
        s.push(top);

        System.out.println();

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        bottom(s, 5);

        System.out.print(s);

    }

}
