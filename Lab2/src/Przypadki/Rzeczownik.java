package Przypadki;

public class Rzeczownik implements Przypadki{
    private String noun;
    Rzeczownik(String noun_) {
        this.noun = noun_;
    }
    @Override
    public String dopelniacz(String gender) {
        //String lastChar = noun.charAt(noun.length()-1);
        switch (gender) {
            case"m":
                return "y/i";
            case"ż":
                return "a/u";
            case "n":
                return "a";
            default:
                System.out.println("nieprawidłowy rodzajnik");
                return "-";
        }
    }

    @Override
    public String nadrzednik(String gender) {
    switch (gender) {
        case "ż":
            return "ą";
        case "m":
            return "em";
        case "n":
            return "em";
        default:
            return "-";
        }
    }
}
