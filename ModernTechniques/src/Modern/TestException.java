package Modern;

public class TestException {

      public static void main(String[] args) {

            int[] arr = { 1, 2, 3, 4, 5 };

            try {
                  System.out.println(sum(arr));

            } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println("\n" + e.getMessage());
                  System.out.println("\n" + e.toString());

                  System.out.println("\nTrace info obtained from getStackTrace ");
                  StackTraceElement[] stackTraceElements = e.getStackTrace();

                  for (int i = 0; i < stackTraceElements.length; i++) {
                        System.out.print("method " + stackTraceElements[i].getMethodName());
                        System.out.print("(" + stackTraceElements[i].getClassName() + ":");
                        System.out.println(stackTraceElements[i].getLineNumber() + ")");
                  }
            }

      }

      private static int sum(int[] arr) {
            int result = 0;
            for (int i = 0; i <= arr.length; i++) {
                  result += arr[i];
            }
            return result;
      }
}
