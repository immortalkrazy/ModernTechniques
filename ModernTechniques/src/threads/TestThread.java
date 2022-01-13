package threads;

public class TestThread {

      public static void main(String[] args) {

            MyThread t1 = new MyThread();

            Thread thread1 = new Thread(t1);

            MyAnotherThread thread2 = new MyAnotherThread();

            thread1.start();
            thread2.start();

      }

}
