public class StandardCalculator {
    private int a;
    private int b;
    StandardCalculator() {}

    StandardCalculator(int a_, int b_) {
        this.a = a_;
        this.b = b_;
    }

    public void setA(int a_) {
        this.a = a_;
    }
    public void setB(int b_) {
        this.b = b_;
    }

    public  int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add() {
        return (a+b);
    }
    public int substract(){
        return (a-b);
    }
}
