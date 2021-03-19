package book;

public class Test {

      public static void main(String[] args) {

            // Test 1
            System.out.println("Test 1");
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

            // Test 2
            System.out.println("Test 2");
            int[] list = new int[5];
            System.out.println(list[4]);

            // Test 3
            System.out.println("Test 3");
            String string = "abc";
            System.out.println(string.charAt(2));

            // Test 4
            System.out.println("Test 4");
            try {
                  int[] lst = new int[10];
                  System.out.println("List[10] is: " + lst[10]);
            } catch (ArithmeticException e) {
                  System.out.println("Arithmatic Exception");
            } catch (RuntimeException e) {
                  System.out.println("Runtime Exception");
            } catch (Exception e) {
                  System.out.println("Exception");
            }

            // Test 5 (12.4.7)
            System.out.println("Test 5");
            try {
                  method();
                  System.out.println("After the method call");
            } catch (ArithmeticException e) {
                  System.out.println("Arithmatic Exception");
            } catch (RuntimeException e) {
                  System.out.println("Runtime Exception");
            } catch (Exception e) {
                  System.out.println("Exception");
            }

            // Test 6 (12.4.8)
            System.out.println("Test 6");
            try {
                  method2();
                  System.out.println("After the method call");
            } catch (ArithmeticException e) {
                  System.out.println("Arithmatic Exception");
            } catch (RuntimeException e) {
                  System.out.println("Runtime Exception");
            } catch (Exception e) {
                  System.out.println("Exception");
            }

            // Test 7 (12.6.1)
            System.out.println("Test 7");
            String string2 = "12.3";
            String string3 = "12.3g";
            System.out.println("Using Try Catch: " + isNumericTryCatch(string2));
            System.out.println("Using  if  else: " + isNumericIfElse(string2));

            System.out.println("Using Try Catch: " + isNumericTryCatch(string3));
            System.out.println("Using  if  else: " + isNumericIfElse(string3));

      }

      private static void method() {
            System.out.println("Result is : " + 1 / 0);
      }

      private static void method2() throws Exception {
            try {
                  String string = "abc";
                  System.out.println(string.charAt(3));
            } catch (RuntimeException e) {
                  System.out.println("Runtime Exception in method");
            } catch (Exception e) {
                  System.out.println("Exception in method");
            }
      }

      private static boolean isNumericTryCatch(String s) {
            try {
                  Double.parseDouble(s);
                  return true;
            } catch (NumberFormatException e) {
                  return false;
            }
      }

      private static boolean isNumericIfElse(String s) {
            for (char c : s.toCharArray()) {
                  if (!Character.isDigit(c) && (c != '.')) {
                        return false;
                  } else {
                        return true;
                  }
            }
            return false;
      }
}
