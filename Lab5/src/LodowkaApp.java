import java.util.Scanner;

public class LodowkaApp {
    public static void main(String[] args) {

        Lodowka l1 = new Lodowka();
        Scanner input = new Scanner(System.in);
        String wybor = "";
        while( wybor!="zamknij" ) {
            System.out.println("Podaj jaka operacje checesz wykonać: dodaj/wez/wypisz/zamknij");
            wybor = input.nextLine();
            switch(wybor) {
            case "dodaj":
                l1.dodaj();
                break;
            case "wez":
                l1.wez();
                break;
            case "wypisz":
                l1.printArr();
                break;
            default:
                System.out.println("Nieprawidłowa operacja!");
                break;
            }
        }

        l1.dodaj();
        l1.wez();
        l1.printArr();
    }
}