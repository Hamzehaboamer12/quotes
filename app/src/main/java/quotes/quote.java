package quotes;

public class quote {

    private String author ;
    private String text ;

    public quote(String author, String text) {
        this.author = author;
        this.text = text;
    }


    @Override
    public String toString() {
        return "quote{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
