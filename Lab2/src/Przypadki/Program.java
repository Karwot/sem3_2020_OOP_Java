package Przypadki;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rzeczownik w l pojedynczej: ");
        String rz = input.next().toLowerCase();
        System.out.println("Podaj rodzajnik tego rzeczownika: (m/ż/n)");
        String gender = input.next().toLowerCase();
        Rzeczownik rzObj = new Rzeczownik(rz);
        System.out.println("Dopelniacz: "+ rz + " + " + rzObj.dopelniacz(gender));
        System.out.println("Nadrzednik: "+ rz + " + " + rzObj.nadrzednik(gender));

        System.out.println("Podaj przymiotnik w l. pojedynczej: ");
        String prz = input.next().toLowerCase();
        System.out.println("Podaj rodzajnik tego przymiotnika: (m/ż/n)");
        String przGender = input.next().toLowerCase();
        Przymiotnik przObj = new Przymiotnik(prz);
        System.out.println("Dopelniacz: "+ prz + " + " + przObj.dopelniacz(przGender));
        System.out.println("Nadrzednik: "+ prz + " + " + przObj.nadrzednik(przGender));
    }
}
