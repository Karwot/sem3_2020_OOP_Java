import java.util.ArrayList;
import java.util.Scanner;

public class Lodowka {
    static ArrayList<Jedzenie> listaJedzenia = new ArrayList<>();

    public Jedzenie jedzenieUzytkownika() {
        System.out.println("Podaj nazwe jedzenia: ");
        Scanner input = new Scanner(System.in);
        String nazwa = input.nextLine();
        System.out.println("Podaj ilosc: ");
        int ilosc = input.nextInt();
        return new Jedzenie(nazwa, ilosc);
    }

    public void dodaj() {
        listaJedzenia.add( jedzenieUzytkownika() );
    }

    public void wez() {
        Jedzenie doWziecia = jedzenieUzytkownika();
        int i=0;
        for( i = 0; i<listaJedzenia.size(); i++) {
            if( doWziecia.getNazwa().equals(listaJedzenia.get(i).getNazwa()) )
                break;
        }

        if(i<listaJedzenia.size() ) {
            if(doWziecia.getIlosc() < listaJedzenia.get(i).getIlosc())
                listaJedzenia.get(i).setIlosc( listaJedzenia.get(i).getIlosc() - doWziecia.getIlosc() );
             else if(doWziecia.getIlosc() == listaJedzenia.get(i).getIlosc())
                listaJedzenia.remove(i);
            else
                System.out.println("Podano nieprawidlowa ilosc towaru do pobrania!");
        }
        else {
            System.out.println("Brak takiego przedmiotu w lodowce");
        }
    }

    public void printArr() {
        for(int i = 0; i<listaJedzenia.size(); i++)
            System.out.println(listaJedzenia.get(i).getNazwa()+", ilosc: "+listaJedzenia.get(i).getIlosc()+"\n");
    }

}
