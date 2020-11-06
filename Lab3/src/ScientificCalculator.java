public class ScientificCalculator extends StandardCalculator {
    ScientificCalculator(int a_, int b_) {
        super(a_, b_);
    }
    ScientificCalculator() {
        super();
    }

    public int Modulo() {
        return getA()%getB();
    }
    public int Factorial(){
        int result = 1;
        for(int i=1; i<=this.getA(); i++) {
            result = result*i;
        }
        return result;
    }
}
