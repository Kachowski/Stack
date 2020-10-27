import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Stack Stack = new Stack();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number in the stack:");
        Stack.push(s.next());

        System.out.println("This should be the first number in the stack: " + Stack.peek());

        System.out.println("Enter a second input:");
        Stack.push(s.next());

        System.out.println("Enter a third input:");
        Stack.push(s.next());

        System.out.println("This should be the last input you entered: " + Stack.pop());
        System.out.println("This should be the size (2): " + Stack.size());

        System.out.println("This should be the second input you entered: " + Stack.pop());
        System.out.println("This should be the size (1): " + Stack.size());

        System.out.println("This should be the first input you entered: " + Stack.pop());
        System.out.println("This should be the size (0): " + Stack.size());

        System.out.println("This will display true to show that the stack is empty: " + Stack.isEmpty());
    }
}
