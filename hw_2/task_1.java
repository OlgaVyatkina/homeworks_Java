 // Task_0
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
package hw_2;
public class task_1 {
public static void main(String[] args) {

String jewels = "aB";
String stones = "aaaAbbbB";
System.out.println(findJewelsStones(jewels, stones));
  }

public static String findJewelsStones(String jewels, String stones){
    String result = "";
    int count = 0;
    for (int i = 0; i < jewels.length(); i++) {
        for (int j = 0; j < stones.length(); j++) {
            if (jewels.charAt(i) == stones.charAt(j)) {
                count++;
            }
        }
    result = result + jewels.charAt(i) + count;
    count = 0;
    }
    return result;
}
}