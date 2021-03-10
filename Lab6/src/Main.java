import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> bag = new Stack<String>();

        Scanner scannerObject = new Scanner(System.in);
        String input = "";
        String item = "";
        while( !input.equals("exit") ) {
            System.out.println("user input: ");
            input = scannerObject.nextLine();

            switch (input.toLowerCase()) {
                case "put":
                    System.out.println("what do you want to put in the stack?");
                    item = scannerObject.nextLine();
                    bag.push(item);
                    System.out.println(item+" has been added to the stack.");
                    break;
                case "take":
                    System.out.println(bag.pop()+" has been removed from the stack.");
                    break;
                case "print":
                    bag.forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("shutting off the program");
                    break;
                    default:
                    System.out.println("incorrect input value");
                    break;
            }

        }

    }
}
