import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> _books;
    private List<Ticket> _tickets;
    private List<Journal> _journals;

    public Library() {
        _books = new ArrayList<>();
        _tickets = new ArrayList<>();
        _journals = new ArrayList<>();
    }

    public void AddBook(Book book) {
        _books.add(book);
    }

    public void AddTicket(Ticket libraryTicket) {
        _tickets.add(libraryTicket);
    }

    public void issueBook(Book book, Ticket libraryTicket, String issueDate, int loanPeriod) {
        Journal journal = new Journal(book, libraryTicket, issueDate, loanPeriod);
        _journals.add(journal);
    }

    public void returnBook(Book book, Ticket ticket, String returnDate) {
        Journal journal = findIssueRecord(book, ticket);
        if (journal != null) {
            journal.SetReturnDate(returnDate);
        }
    }

    public List<Ticket> findOverdueStudents(String currentDate) {
        List<Ticket> overdueStudents = new ArrayList<>();

        for (Journal journal : _journals) {
            if (!journal.isReturned() && isOverdue(journal.GetDate(), journal.GetPeriod(), currentDate)) {
                overdueStudents.add(journal.GetTicket());
            }
        }

        return overdueStudents;
    }

    private Journal findIssueRecord(Book book, Ticket libraryTicket) {
        for (Journal issueRecord : _journals) {
            if (issueRecord.GetBook().equals(book) && issueRecord.GetTicket().equals(libraryTicket)) {
                return issueRecord;
            }
        }
        return null;
    }

    private boolean isOverdue(String issueDate, int loanPeriod, String currentDate) {
        LocalDate issueLocalDate = LocalDate.parse(issueDate);
        LocalDate currentLocalDate = LocalDate.parse(currentDate);

        LocalDate dueDate = issueLocalDate.plusDays(loanPeriod);
        return currentLocalDate.isAfter(dueDate);
    }
}
