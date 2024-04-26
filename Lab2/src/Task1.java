import java.util.Scanner;
//Написать программу, которая предлагает пользователю ввести
// c клавиатуры номер дня недели, и в ответ показывает название
// этого дня (например, 6 – это суббота). Решить с использованием switch.
public class Task1 {
    public void Task1Method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели: ");
        int dayNumber = scanner.nextInt();

        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                //break;
            case 7:

                dayName = "Воскресенье";
                break;
            default:
                dayName = "Некорректный номер дня";
                break;
        }
        String dayNameIf = "";
        if (dayNumber == 5){
            dayNameIf = "Пятница";
        } else if (dayNumber == 6) {
            dayNameIf = "Суббота";
        } else if (dayNumber == 7) {
            dayNameIf = "Воскресенье";
        }
        else {
            dayNameIf = "Некорректный номер дня";
        }

        System.out.println("День недели: " + dayName);
        System.out.println("День недели: " + dayNameIf);
    }
}