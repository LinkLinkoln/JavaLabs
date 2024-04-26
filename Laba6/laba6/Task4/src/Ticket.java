public class Ticket implements ITicket{
    private int _number;
    private String _student;
    private String _group;
    public Ticket(int number, String student, String group) {
        _number = number;
        _student = student;
        _group = group;
    }
    public int GetNumber() {
        return _number;
    }
    public String GetStudent() {
        return _student;
    }
    public String GetGroup() {
        return _group;
    }
}
