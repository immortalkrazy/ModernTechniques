package codingQuest;

public class Fibonacci {

      public static void main(String[] args) {

            int num = 12;
            System.out.println(fib(num));
      }

      public static int fib(int num) {
            if (num == 0)
                  return 0;
            else if (num == 1)
                  return 1;
            else {
                  return fib(num - 1) + fib(num - 2);
            }
      }
}