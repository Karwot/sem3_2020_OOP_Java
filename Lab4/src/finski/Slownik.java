package finski;

public class Slownik {
    public static String[] slowaPL = {"jeden","dwa","trzy"};
    public static String[] slowaFI = {"yksi","kaksi","kolme"};

    public static void sprawdzFI(String PL, String FI) {
        int indexPL = -1;
        for(int i=0; i<slowaPL.length; i++) {
            if(slowaPL[i].equals(PL))
                indexPL = i;
        }
        int indexFI = -1;
        for(int j=0; j<slowaFI.length; j++) {
            if(slowaFI[j].equals(FI))
                indexFI=j;
        }
        if(indexFI == indexPL)
            System.out.println("Poprawna odpowiedz");
        else {
            System.out.println("Niepoprawna odpowiedź. Poprawna odpowiedź to: "+slowaFI[indexPL]+" \n");
        }
    }

    public static void sprawdzPL(String FI, String PL) {
        int indexPL = -1;
        for(int i=0; i<slowaPL.length; i++) {
            if(slowaPL[i].equals(PL))
                indexPL = i;
        }
        int indexFI = -1;
        for(int j=0; j<slowaFI.length; j++) {
            if(slowaFI[j].equals(FI))
                indexFI=j;
        }
        if(indexFI == indexPL)
            System.out.println("Poprawna odpowiedz");
        else {
            System.out.println("Niepoprawna odpowiedź. Poprawna odpowiedź to: "+slowaPL[indexFI]+" \n");
        }
    }
}
