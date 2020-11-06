import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe całkowitą: ");
        Scanner input = new Scanner((System.in));
        int a = input.nextInt();
        ScientificCalculator calc = new ScientificCalculator();
        calc.setA(a);
        System.out.println("Silnia: "+calc.Factorial());
        System.out.println("Podaj kolejna liczbe całkowitą: ");
        int b = input.nextInt();
        calc.setB(b);
        System.out.println("+ "+calc.add()+
                "\n - "+calc.substract()+
                "\n "+calc.getA()+"%"+calc.getB()+" = "+calc.Modulo());

        input.close();
    }
}
