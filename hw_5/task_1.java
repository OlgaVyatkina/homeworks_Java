// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package hw_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class task_1 {

 // Метод, который добавляет номера в книгу   
public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
    if (map.containsKey(key)) {
        map.get(key).add(value);
    } else {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(value);
        map.put(key, list);
    }
        
}
// Метод, который печатает список контактов
public static void printBook(Map<String, ArrayList<Integer>> map){
    for (var item : map.entrySet()) {
        String phones = "";
        for(int el: item.getValue()){
            phones = phones + el + ", ";
        }
    System.out.printf("%s: %s \n", item.getKey(), phones);
    }
}
public static void main(String[] args) {
    Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
    addNumber("Ivanov", 123, bookPhone);
    addNumber("Ivanov", 1234, bookPhone);
    addNumber("Petrov", 546585, bookPhone);
    addNumber("Sidorov", 8956477, bookPhone);
    addNumber("Ivanov", 12356233, bookPhone);
    addNumber("Petrov", 787897, bookPhone);
    printBook(bookPhone);
}
}    
