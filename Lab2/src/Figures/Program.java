package Figures;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the figure you would like to create: ");
        String s = input.next().toLowerCase();
        System.out.println("you entered: " + s);


        switch (s) {
            case "circle":
                System.out.println("Enter radius: ");
                int r = input.nextInt();
                Circle c = new Circle(r);
                System.out.println("Parimeter: "+ c.parimeter() );
                System.out.println("Area: "+c.area());
                break;
            case "square":
                System.out.println("Enter side: ");
                int side = input.nextInt();
                Square square = new Square(side);
                System.out.println("Parimeter: "+ square.parimeter() );
                System.out.println("Area: "+square.area());
                break;
            case "rectangle":
                System.out.println("Enter a: ");
                int a = input.nextInt();
                System.out.println("Enter b: ");
                int b = input.nextInt();
                Rectangle rect = new Rectangle(a, b);
                System.out.println("Parimeter: " + rect.parimeter());
                System.out.println("Area: " + rect.area());
                break;
                default:
                System.out.println("no such figure");
        }

    }
}
