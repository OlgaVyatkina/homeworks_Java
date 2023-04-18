// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


package hw_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task_1 {
      
public static void main(String[] args) throws Exception {
    
    Notebook notebook1 = new Notebook("Lenovo IdealPad 5", 8, 256, "Windows 10", "red", 15.6);
    Notebook notebook2 = new Notebook("Honor MagicBook 16", 16, 512, "no OS", "green", 16.1);
    Notebook notebook3 = new Notebook("Apple MacBook Air 13", 8, 256, "MacOs", "blue", 13.3);
    Notebook notebook4 = new Notebook("HP 250 G7", 4, 1024, "no OS", "gray", 15.6);
    Notebook notebook5 = new Notebook("Xiomi RedmiBook 15", 8, 256, "Windows 11", "black", 15.6);
        
    Set<Notebook> setNotebook = new HashSet<Notebook>();
    setNotebook.add(notebook1);
    setNotebook.add(notebook2);
    setNotebook.add(notebook3);
    setNotebook.add(notebook4);
    setNotebook.add(notebook5);
               
    System.out.printf("Unique notebooks, total: %d \n", setNotebook.size());
    
            for (Notebook notebook : setNotebook) {
                System.out.println();
                System.out.println(notebook);
            }
    
            Map<Integer, String> mapCrit = new HashMap<>();
            mapCrit.put(1, "RAM size");
            mapCrit.put(2, "HDD (or SSD) size");
            mapCrit.put(3, "OS");
            mapCrit.put(4, "Colour");
            mapCrit.put(5, "Display size");
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Input minimal parameter for search \n1. RAM size: ");
            int ramUser = sc.nextInt();
    
            System.out.println("HDD (or SSD) size: ");
            int storUser = sc.nextInt();
    
            System.out.println("Display size");
            double digUser = sc.nextDouble();
    
            System.out.println();
    
            for (Notebook note : setNotebook) {
                if ((note.getRam() >= ramUser) && (note.getStorageCap() >= storUser) && note.getDiagonal() >= digUser) {
                    System.out.println(note.toString());
                }
            }
            sc.close();
        }
    }   

