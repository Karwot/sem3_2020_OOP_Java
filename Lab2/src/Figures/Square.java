package Figures;


public class Square implements FigureMethods {
    private double side;
    Square(double side_) {
        this.side = side_;
    }

    @Override
    public double parimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
