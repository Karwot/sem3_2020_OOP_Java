package Figures;

public class Circle implements FigureMethods {
    private double radius;
    Circle(double radius_) {
        this.radius = radius_;
    }

    @Override
    public double parimeter() {
        return 2* Math.PI*radius;
    }
    @Override
    public double area() {
        return (float) (Math.PI*radius*radius);
    }
}
