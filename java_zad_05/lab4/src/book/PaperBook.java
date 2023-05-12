package book;

public class PaperBook extends Book {
    private int releaseYear;

    public PaperBook(String wPustyniIWPuszczy, String henrykSienkiewicz, int i, int i1) {
        super();
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public void setNumberOfPages(int numberOfPages) {
        super.setNumberOfPages(numberOfPages);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public int getNumberOfPages() {
        return super.getNumberOfPages();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
