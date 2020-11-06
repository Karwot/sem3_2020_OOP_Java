import wloski.Slownik;
//import finski.Slownik;
import java.util.Scanner;

public class SlownikApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz jezyk: Wloski[w] lub finski [f]");
        input.reset();

        char language = input.nextLine().charAt(0);
        language = Character.toLowerCase(language);
        switch (language) {
            case 'w':
                String word;
                for (int i = 0; i < wloski.Slownik.slowaWL.length; i++) {
                    System.out.println("Przetlumacz slowo " + wloski.Slownik.slowaWL[i] + " na j. polski: ");
                    word = input.nextLine();
                    wloski.Slownik.sprawdzPL(wloski.Slownik.slowaWL[i], word);
                }

                for (int i = 0; i < wloski.Slownik.slowaWL.length; i++) {
                    System.out.println("Przetlumacz slowo " + wloski.Slownik.slowaPL[i] + " na j. włoski: ");
                    word = input.nextLine();
                    wloski.Slownik.sprawdzWL(wloski.Slownik.slowaPL[i], word);
                }
                break;
            case 'f':
                for (int i = 0; i < finski.Slownik.slowaFI.length; i++) {
                    System.out.println("Przetlumacz slowo " + finski.Slownik.slowaPL[i] + " na j. fiński: ");
                    word = input.nextLine();
                    finski.Slownik.sprawdzFI(finski.Slownik.slowaPL[i], word);
                }

                for (int i = 0; i < finski.Slownik.slowaFI.length; i++) {
                    System.out.println("Przetlumacz slowo " + finski.Slownik.slowaFI[i] + " na j. polski: ");
                    word = input.nextLine();
                    finski.Slownik.sprawdzPL(finski.Slownik.slowaFI[i], word);
                }
                break;
            default:
                System.out.println("Nieprawidlowy jezyk");
                break;
        }


    }

}
