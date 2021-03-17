package Modern;

public class Test {

      public static void main(String[] args) {

            long val = Long.MAX_VALUE + 1;
            System.out.println(val);

            try {
                  int value = 50;
                  if (value < 40) {
                        throw new Exception("Value is too small");
                  }
            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }
            System.out.println("Continue after the catch block");

            int[] list = new int[5];
            System.out.println(list[4]);

            String string = "abc";
            System.out.println(string.charAt(2));
      }
}
