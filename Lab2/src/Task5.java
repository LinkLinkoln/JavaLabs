import java.util.Scanner;

public class Task5 {
    public void Task5Method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения (день месяц год): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        // Определение знака зодиака
        String zodiacSign;
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Водолей";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Рыбы";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Овен";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Телец";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Близнецы";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Рак";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Лев";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Дева";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Весы";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Скорпион";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Стрелец";
        } else {
            zodiacSign = "Козерог";
        }

        // Определение года по китайскому календарю
        String chineseYear;
        switch ((year - 4) % 12) {
            case 0:
                chineseYear = "Крысы";
                break;
            case 1:
                chineseYear = "Быка";
                break;
            case 2:
                chineseYear = "Тигра";
                break;
            case 3:
                chineseYear = "Кролика";
                break;
            case 4:
                chineseYear = "Дракона";
                break;
            case 5:
                chineseYear = "Змеи";
                break;
            case 6:
                chineseYear = "Лошади";
                break;
            case 7:
                chineseYear = "Овцы";
                break;
            case 8:
                chineseYear = "Обезьяны";
                break;
            case 9:
                chineseYear = "Петуха";
                break;
            case 10:
                chineseYear = "Собаки";
                break;
            case 11:
                chineseYear = "Свиньи";
                break;
            default:
                chineseYear = "Ошибка";
                break;
        }

        System.out.println("Ваш знак зодиака: " + zodiacSign);
        System.out.println("Год по китайскому календарю: " + chineseYear);
    }
}