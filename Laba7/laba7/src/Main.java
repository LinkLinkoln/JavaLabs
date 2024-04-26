public class Main {
    public static void main(String[] args) {
        MyArrayList<Double> myList = new MyArrayList<>();

        // Добавление элементов в конец списка
        myList.pushBack(1.2d);
        myList.pushBack(2d);
        myList.pushBack(3d);
        System.out.println("Массив после добавления элементов в конец: " + myList);

        // Удаление первого элемента
        myList.popFront();
        System.out.println("Массив после удаления первого элемента: " + myList);

        // Добавление элемента в начало списка
        myList.pushFront(0d);
        System.out.println("Массив после добавления элемента в начало: " + myList);

        // Вставка элемента по индексу
        myList.insert(10d, 2);
        System.out.println("Массив после вставки элемента по индексу: " + myList);

        // Удаление элемента по индексу
        myList.removeAt(1);
        System.out.println("Массив после удаления элемента по индексу: " + myList);

        // Удаление элемента
        myList.remove(3d);
        System.out.println("Массив после удаления элемента: " + myList);

        // Удаление всех элементов со значением 2
        myList.removeAll(2d);
        System.out.println("Массив после удаления всех элементов со значением 2: " + myList);

        // Удаление последнего элемента
        myList.popBack();
        System.out.println("Массив после удаления последнего элемента: " + myList);

        // Очистка списка
        myList.clear();
        System.out.println("Массив после очистки: " + myList);

        // Добавление элементов в список
        myList.pushBack(1d);
        myList.pushBack(2d);
        myList.pushBack(3d);
        System.out.println("Массив после добавления элементов: " + myList);

        // Изменение порядка следования элементов на противоположный
        MyArrayList<Double> resersedList=myList.reverse();
        System.out.println("Массив после изменения порядка следования элементов на противоположный: " + resersedList);

        // Перемешивание элементов
        myList.shuffle();
        System.out.println("Массив после перемешивания элементов: " + myList);

        // Создание копии списка
        MyArrayList<Double> clonedList = myList.clone();
        System.out.println("Копия массива: " + clonedList);

        // Проверка равенства списков
        System.out.println("Списки равны: " + myList.equals(clonedList));

        // Получение элемента по индексу
        double element = myList.getElementAt(1);
        System.out.println("Элемент по индексу 1: " + element);
    }
}

