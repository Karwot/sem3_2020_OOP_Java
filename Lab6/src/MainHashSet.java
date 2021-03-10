import java.util.HashSet;
import java.util.Scanner;

public class MainHashSet {
    public static void main(String[] args) {

        HashSet<String> bag = new HashSet<String>();

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
                    bag.add(item);
                    System.out.println(item+" has been added to the stack.");
                    break;
                case "take":
                    System.out.println("what do you want to remove from the stack?");
                    item = scannerObject.nextLine();
                    if ( bag.remove(item) ) {
                        System.out.println(item+" has been removed from the stack.");
                    } else {
                        System.out.println("no such item in the stack:"+item);
                    }
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
