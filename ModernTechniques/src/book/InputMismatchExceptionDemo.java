package book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            boolean continueInput = true;

            do {
                  try {
                        System.out.println("Enter an Integer");
                        int number = input.nextInt();

                        System.out.println("The number entered is " + number);

                        continueInput = false;
                        input.close();
                  }

                  catch (InputMismatchException e) {
                        System.out.println("It has to be an integer");

                        input.nextLine();
                  }

            } while (continueInput);

      }

}
