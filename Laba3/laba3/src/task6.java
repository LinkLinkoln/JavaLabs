public class task6 {
    public static void main(String[] args)
    {
        int numbers=100;

        for (int i = 1; i <= 1000; i++)
        {
            if (i % 15 == 0) {
                System.out.println("hiss");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
