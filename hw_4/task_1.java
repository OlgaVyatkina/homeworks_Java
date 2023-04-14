   // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом

package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
    
 public class task_1 {   
     public static void checkOn(Deque<Integer> deque) {
        Boolean flag = true;
        for (int i = 0; i < deque.size() / 2; i++) {
          if (deque.pollFirst() != deque.pollLast())
            flag = false;
        }
        System.out.println(flag ? "yes" : "no");   
      }
    
      public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 1, 4, 3, 2, 1));
        checkOn(deque);
      }

}