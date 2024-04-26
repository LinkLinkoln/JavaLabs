public class task2 {
    public static void main(String[] args) {
        MainString item=new MainString("Привет");
        int getLength= item.getLength();
System.out.println("Длина: "+getLength);
boolean contain=item.contains('П');
        System.out.println("Есть ли символ:"+contain);
    }
}
