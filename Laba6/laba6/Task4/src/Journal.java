public class Journal implements IJournal{
    private Book _book;
    private Ticket _ticket;
    private String _date;
    private int _period;
    private String _dateToReturn;

    public Journal(Book book, Ticket ticket, String date, int period) {
        _book = book;
        _ticket = ticket;
        _date = date;
        _period = period;
        _dateToReturn = null;
    }

    public Book GetBook() {
        return _book;
    }

    public Ticket GetTicket() {
        return _ticket;
    }

    public String GetDate() {
        return _date;
    }

    public int GetPeriod() {
        return _period;
    }

    public String GetReturnDate() {
        return _dateToReturn;
    }

    public void SetReturnDate(String dateToReturn) {
        _dateToReturn = dateToReturn;
    }

    public boolean isReturned() {
        return _dateToReturn != null;
    }
}
