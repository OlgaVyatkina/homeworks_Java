//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
  // result [6,6,0,1]


// package hw_4;

// import java.util.ArrayDeque;
// import java.util.Arrays;
// import java.util.Deque;

// public class task_2 {
//   public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
//     Deque<Integer> dResult = new ArrayDeque<>();
//     int cash = 0;
//     int len = Math.max(d1.size(), d2.size());
//     for (int i = 0; i < len; i++) {
//       int sum = d1.pollFirst() + d2.pollFirst() + cash;
//       dResult.addLast(sum % 10);
//       cash = sum / 10;
//     }
//     if (cash > 0)
//       dResult.addLast(cash);
//     return dResult;
//   }

//   public static void main(String[] args) {
//     Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
//     Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
//     System.out.println(sum(d1, d2));
//   }

// }

package hw_4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class task_2 {

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
// result [6,6,0,1]
LinkedList<Integer> ll = new LinkedList<Integer>();
String str = new String();
String str1 = new String();
int d1Size = d1.size();
int d2Size = d2.size();
for (int index = 0; index < d1Size; index++) {
str += d1.pollLast();
}
for (int i = 0; i < d2Size; i++) {
str1 += d2.pollLast();
}
int summ = Integer.parseInt(str) + Integer.parseInt(str1);
while (summ > 0 ) {
ll.add(summ%10);
summ = summ/10;
}
System.out.println(ll);
}
}