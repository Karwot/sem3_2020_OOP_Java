import java.util.Scanner;

public class MainProgramIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj slowo  w jezyku polskim: ");
        String toTranslate = input.nextLine();
        System.out.println("slowo: \""+toTranslate+"\"");
        System.out.println(ItalianBasic.plTOit(toTranslate));
    }
}
