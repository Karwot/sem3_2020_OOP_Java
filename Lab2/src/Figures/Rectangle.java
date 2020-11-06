package Figures;

public class Rectangle implements FigureMethods {
    private double a;
    private double b;

    Rectangle(double a_, double b_) {
        this.a = a_;
        this.b = b_;
    }

    @Override
    public double parimeter() {
        return 2*(a+b);
    }

    @Override
    public double area() {
        return a*b;
    }
}
