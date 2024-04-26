import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Money money1=ReadMoney(scanner);
        Money money2=ReadMoney(scanner);
        while(true)
        {
            Menu(scanner);
            int choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                  Money sum=money1.add(money2);
                  System.out.println("Сумма:"+sum.ToString());
                    break;
                case 2:
                    Money sub=money1.subtract(money2);
                    System.out.println("Вычитание:"+sub.ToString());
                    break;
                case 3:
                    System.out.println("Введите делитель");
                    int devisor=scanner.nextInt();
                    Money div=money1.divide(devisor);
                    System.out.println("Деление:"+div.ToString());
                    break;
                case 4:
                    System.out.println("Введите множитель");
                    double multiplier=scanner.nextDouble();
                    Money mul=money1.multiply(multiplier);
                    System.out.println("Деление:"+mul.ToString());
                    break;
                case 5:
                    boolean isEqual= money1.isEqual(money2);
                    boolean isGreaterThan= money1.isGreaterThan(money2);
                    boolean isLessThan= money1.isLessThan(money2);
                    if(isEqual)
                    {
                        System.out.println("Равны");
                    }
                    else if(isGreaterThan)
                    {
                        System.out.println("1>2");
                    }
                    else if(isLessThan)
                    {
                        System.out.println("1<2");
                    }
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Неверно введенный формат данных");
                    break;
            }
        }

    }
    private static void Menu(Scanner scanner){
        System.out.println("----- Меню -----");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Деление");
        System.out.println("4. Умножение");
        System.out.println("5. Сравнение");
        System.out.println("6. Выход");
        System.out.print("Выберите пункт меню (1-6): ");
    }

    private static Money ReadMoney(Scanner scanner) {
        System.out.print("Введите сумму в формате 'рубли,копейки': ");
        String input = scanner.next();
        String[] parts = input.split(",");

        if (parts.length != 2) {
            System.out.println("Некорректный формат ввода. Повторите попытку.");
            return ReadMoney(scanner);
        }

        try
        {
            long rubles = Long.parseLong(parts[0]);
            byte kopeks = Byte.parseByte(parts[1]);
            return new Money(rubles, kopeks);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Некорректный формат числа. Повторите попытку.");
            return ReadMoney(scanner);
        }
    }

}
