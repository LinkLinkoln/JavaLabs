public class Book implements IBook{
    private String _title;
    private String _author;
    public Book(String title, String author) {
        _title = title;
        _author = author;
    }
    public String GetTitle() {
        return _title;
    }
    public String GetAuthor() {
        return _author;
    }
}
