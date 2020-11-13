public class Jedzenie {
    private String nazwa;
    private int ilosc;
    Jedzenie(String nazwa_, int ilosc_) {
        this.nazwa = nazwa_;
        this.ilosc = ilosc_;
    }

    public String getNazwa() {
        return nazwa;
    }
    public int getIlosc() {
        return ilosc;
    }
    public void setIlosc(int ilosc_) {
        this.ilosc = ilosc_;
    }
}
