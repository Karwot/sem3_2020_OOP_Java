package firstprogram;

public class Rectangle {
    private int w;
    private int l;
    Rectangle(int _w, int _l) {
        this.w = _w;
        this.l = _l;
    }

    public float Paramiter() {
        return 2*w+2*l;
    }

    public float Area() {
        return w*l;
    }
}
