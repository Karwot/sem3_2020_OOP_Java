package wloski;

public class Slownik {
    static public String[] slowaWL = { "uno", "due", "tre" };
    static public String[] slowaPL = { "jeden", "dwa", "trzy"};

    public static void sprawdzWL(String PL, String IT) {
        int indexPL = -1;
        for(int i=0; i<slowaPL.length; i++) {
            if(slowaPL[i].equals(PL))
                indexPL = i;
        }
        int indexIT = -1;
        for(int j=0; j<slowaWL.length; j++) {
            if(slowaWL[j].equals(IT))
                indexIT=j;
        }
        if(indexIT == indexPL)
            System.out.println("Poprawna odpowiedz");
        else {
            System.out.println("Niepoprawna odpowiedź. Poprawna odpowiedź to: "+slowaWL[indexPL]+" \n");
        }
    }

    public static void sprawdzPL(String IT, String PL) {
        int indexPL = -1;
        for(int i=0; i<slowaPL.length; i++) {
            if(slowaPL[i].equals(PL))
                indexPL = i;
        }
        int indexIT = -1;
        for(int j=0; j<slowaWL.length; j++) {
            if(slowaWL[j].equals(IT))
                indexIT=j;
        }
        if(indexIT == indexPL)
            System.out.println("Poprawna odpowiedz");
        else {
            System.out.println("Niepoprawna odpowiedź. Poprawna odpowiedź to: "+slowaPL[indexIT]+" \n");
        }
    }

}
