public interface IJournal {
    public Book GetBook();
    public Ticket GetTicket();
    public String GetDate();
    public int GetPeriod() ;
    public String GetReturnDate();
    public void SetReturnDate(String dateToReturn);
    public boolean isReturned();
}
