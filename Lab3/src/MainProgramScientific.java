import java.util.Scanner;

public class MainProgramScientific {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Podaj a");
        int a = input.nextInt();
        System.out.println("Podaj b");
        int b = input.nextInt();
        CalculatorProgrammer newCalc = new CalculatorProgrammer();
        System.out.println("and: "+ CalculatorProgrammer.and(a,b)+"\n or: "+CalculatorProgrammer.or(a,b));
    }
}
