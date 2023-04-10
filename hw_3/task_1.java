
// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


package hw_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_1 {

public static List<Integer> removeEvenValue(List<Integer> list) {
    List<Integer> list_new = new ArrayList<>();
    for (int i=0; i<list.size(); i++) {
        if (list.get(i) % 2 != 0){
            list_new.add(list.get(i));
        }
    }
    return list_new;
}

public static Integer getMax(List<Integer> list){ 
    int max = list.get(0);
    for (int i = 0; i < list.size(); i++){
        if (list.get(i) > max) {
    max = list.get(i);
}
}
    return max;
}
public static Integer getMin(List<Integer> list){
    int min = list.get(0);
    for (int i = 0; i < list.size(); i++){
        if (list.get(i) < min) {
            min = list.get(i);
}
}
    return min;
}
public static Double getAverage(List<Integer> list){
    int sum = 0;
    double Average = 0;
    for (int i = 0; i < list.size(); i++){
        sum += list.get(i);
}
Average = sum / list.size();
return Average;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);  
System.out.println("Введите длину списка: ");
int N = scan.nextInt();
List<Integer> listInt = new ArrayList<>();
for (int i = 0; i < N; i++) {
    listInt.add(i);
}
System.out.println(listInt);
System.out.println(getMax(listInt));
System.out.println(getMin(listInt));
System.out.println((getAverage(listInt)));
System.out.println((removeEvenValue(listInt)));
scan.close();
}
}

