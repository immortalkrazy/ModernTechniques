package cisc3115;

public class Test {

      public static void main(String[] args) {

            Feline f1 = new Feline("Jimmy");
            Feline f2 = new Feline("Thacher");
            Feline f3 = new Feline("Jimmy");
            Animal f4 = new Animal("Jimmy");

            System.out.println("Test 1 " + f1.equals(f2));
            System.out.println("Test 2 " + f1.equals(f3));

      }

}
