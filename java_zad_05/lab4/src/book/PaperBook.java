package book;

public class PaperBook extends Book {
    private int releaseYear;

    public PaperBook(String title, String author, int numberOfPages, int releaseYear) {
        super.setTitle(title);
        super.setAuthor(author);
        super.setNumberOfPages(numberOfPages);
        this.releaseYear = releaseYear;
    }

    public PaperBook() {

    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}