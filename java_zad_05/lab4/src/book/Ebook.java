package book;

public class Ebook extends Book {
    private int size;
    private String format;

    public Ebook(String title, String author, int numberOfPages, int size, String format) {
        super(title, author, numberOfPages);
        this.size = size;
        this.format = format;
    }

    public Ebook() {

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }
}