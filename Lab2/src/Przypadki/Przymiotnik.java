package Przypadki;

public class Przymiotnik implements Przypadki {
    private String adjective;
    public Przymiotnik(String adjective_) {
        this.adjective = adjective_;
    }

    @Override
    public String dopelniacz(String gender) {
        switch(gender) {
            case"ż":
                return "ej";
            case"m":
                return "ego";
            case"n":
                return "ego";
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
                return "ym/im";
            case "n":
                return "ym/im";
            default:
                return "-";
        }
    }
}
