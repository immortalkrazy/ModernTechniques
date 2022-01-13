package threads;

public class MyAnotherThread extends Thread {

      @Override
      public void run() {

            for (int i = 10; i >= 0; i--) {
                  System.out.println("MyAnotherThraed value is: " + i);
                  System.out.println(Thread.currentThread().getName());

                  try {
                        Thread.sleep(2000);

                  } catch (Exception e) {
                        e.printStackTrace();
                  }
            }
      }
}
