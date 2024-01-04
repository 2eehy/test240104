public class BookDTO {
    public  int bNo;
    public int category;

    private String title;

    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;

    }

    public void setCategory(int category){this.category = category;}

    public void setTitle(String title){this.title = title;}

    public void setAuthor(String author) {this.author = author;}


    @Override
    public String toString() {
        return "BookDTO{" +
                " category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}














