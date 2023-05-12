package book;

public class Ebook extends Book {
    private int size;
    private String format;

    public Ebook(String przygodyTomkaSawyera, String markTwain, int i, int i1, String pdf) {
        super();
    }

    @Override
    public void setNumberOfPages(int numberOfPages) {
        super.setNumberOfPages(numberOfPages);
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
