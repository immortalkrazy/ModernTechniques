package threads;

public class MyThread implements Runnable {

      @Override
      public void run() {

            for (int i = 0; i <= 10; i++) {
                  System.out.println("Value of 1 is: " + i);
                  System.out.println(Thread.currentThread().getName());
                  try {
                        Thread.sleep(1000);

                  } catch (InterruptedException e) {

                        e.printStackTrace();
                  }
            }
      }
}
