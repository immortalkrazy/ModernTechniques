package liVarargs;

public class Varargs {

      public static void main(String[] args) {

            String item1 = "Apple";
            String item2 = "Mango";
            String item3 = "Banana";

            printShoppingList(item1, item2, item3);
            printShoppingList("Apple", "Mango", "Banana");

      }

      // 3 dots used here (String...) tells the run to make an array of variable
      // length
      private static void printShoppingList(String... items) {

            System.out.println("Shopping List");

            for (int i = 0; i < items.length; i++) {
                  System.out.println(i + 1 + ": " + items[i]);
            }
            System.out.println();

      }

}
