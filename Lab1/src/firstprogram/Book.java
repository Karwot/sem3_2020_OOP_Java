package firstprogram;

public class Book {
    private String author;
    private String title;
    private int noOfPages;
    Book(String author_, String title_, int noOfPages_) {
        this.author = author_;
        this.title = title_;
        this.noOfPages = noOfPages_;
    }

    public int titleLength(){
        return this.title.length();
    }
}


