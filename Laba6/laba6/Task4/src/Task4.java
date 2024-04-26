import java.util.List;

public class Task4 {
    public static void main(String[]args){
        Library library = new Library();

        Book book1 = new Book("Невеста Ноября", "Анна Джейн");
        Book book2 = new Book("Портрет Дориана Грея", "Оскар Уальд");
        Book book3 = new Book("Божественная комедия", "Данте Алигьери");
        Book book4 = new Book("Дракула", "Брэм Стокер");
        library.AddBook(book1);
        library.AddBook(book2);
        library.AddBook(book3);
        library.AddBook(book4);
        Ticket ticket1 = new Ticket(1, "Иванов Иван", "ПИР-221");
        Ticket ticket2 = new Ticket(2, "Алиев Петр", "АСОИР-201");
        Ticket ticket3 = new Ticket(3, "Сизоненко София", "АСОИР-211");
        Ticket ticket4 = new Ticket(4, "Савченко Олег", "ПИР-201");
        library.AddTicket(ticket1);
        library.AddTicket(ticket2);
        library.AddTicket(ticket3);
        library.AddTicket(ticket4);

        library.issueBook(book1, ticket1, "2024-03-20", 7);
        library.issueBook(book2, ticket2, "2024-03-22", 5);
        library.issueBook(book3, ticket3, "2024-03-24", 10);
        library.issueBook(book4, ticket4, "2024-03-26", 4);

        //        library.returnBook(book1, ticket1, "2024-03-24");
        //        library.returnBook(book2, ticket2, "2024-03-29");
        //        library.returnBook(book3, ticket3, "2024-03-24");
        //        library.returnBook(book4, ticket4, "2024-03-29");

        List<Ticket> overdueStudents = library.findOverdueStudents("2027-04-02");

        if (overdueStudents.isEmpty()) {
            System.out.println("Нет должников.");
        } else {
            System.out.println("Список должников:");
            for (Ticket ticket : overdueStudents) {
                System.out.println("Номер билета: " + ticket.GetNumber());
                System.out.println("Студент: " + ticket.GetNumber());
                System.out.println("Группа: " + ticket.GetNumber());
                System.out.println();
            }
        }
    }
}
