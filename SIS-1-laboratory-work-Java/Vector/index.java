package Vector;

import Vector.MyVector;
import Vector.MyCollection;

public class index {
    public static void main(String[] args) {
        Vector.MyVector vector = new Vector.MyVector(new int[] { 2, 7, 3, 1, 5, 6, 7, 2, 9, 0, 2 }); // Создаем объект
                                                                                                     // MyVector и
        // инициализируем его массив

        System.out.println("Original vector content:"); // Выводим исходное содержимое вектора
        vector.toStringValue();

        vector.add(10);
        System.out.println("Added element 10:"); // Добавляем элемент 10 в вектор
        vector.toStringValue();

        vector.remove(1, 7);
        System.out.println("Deleted element 7 at index 1:"); // Удаляем элемент 7 по индексу 1
        vector.toStringValue();

        int searchElement = 5;
        if (vector.contains(searchElement)) { // Проверяем, содержит ли вектор элемент 5
            System.out.println(searchElement + " found in vector.");
        } else {
            System.out.println(searchElement + " not found in vector.");
        }

        vector.insertElementAt(15, 3); // Вставляем элемент 15 по индексу 3
        System.out.println("Element 15 inserted at index 3:");
        vector.toStringValue();

        vector.removeAt(2); // Удаляем элемент по индексу 2
        System.out.println("Element at index 2 removed:");
        vector.toStringValue();

        vector.removeAll(2); // Удаляем все элементы со значением 2
        System.out.println("Removed all elements with value 2:");
        vector.toStringValue();

        vector.reverse(); // Инвертируем порядок элементов
        System.out.println("Inverted vector:");
        vector.toStringValue();

        vector.set(4, 100); // Устанавливаем значение 100 по индексу 4
        System.out.println("Set to 100 at index 4:");
        vector.toStringValue();

        vector.sort(); // Сортируем вектор
        System.out.println("Sorted vector:");
        vector.toStringValue();

        System.out.println("Vector size: " + vector.size()); // Выводим размер вектора

        vector.clear(); // Очищаем вектор
        System.out.println("Vector cleared.");
        vector.toStringValue();
    }
}
