package firstprogram;

public class MainThread {
    public static void main(String[] args) {

        Circle c = new Circle(4);
        System.out.println(c.getRadius());

        Rectangle r = new Rectangle(5, 2);
        System.out.println("Paramiter: "+ r.Paramiter() + " Area: " + r.Area());
        String st = new String();
        st = "Hello, World!";
        System.out.println(st);
        String happy = "Happy";
        System.out.println("\n p from happy: " + happy.charAt((2)));
        String funny = "FUNNY";
        funny = funny.toLowerCase();
        System.out.println(funny);

        String s1 = "UNHAPPY";
        String s2 = s1.substring(2, 7);
        System.out.println(s2);

        Book b1 = new Book("Leo Tolstoy", "War and Piece", 1000);
        Book b2 = new Book("Rene Goscinny", "Le Petit Nicola", 100);
        System.out.println("b1: "+b1.titleLength());
        System.out.println(("b2: "+ b2.titleLength()));
    }
}
