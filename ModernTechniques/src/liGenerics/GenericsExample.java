package liGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

      public GenericsExample() {
            // TODO Auto-generated constructor stub
      }

      public static void main(String[] args) {

            // Example without Generic
            List names = new ArrayList();
            names.add("Kelly");
            // type casting
            String name = (String) names.get(0);
            System.out.println("First name: " + name);
            // names.add(7);

            // Example with Generic
            List<String> names2 = new ArrayList<String>();
            names2.add("Kelly");

            String name2 = names2.get(0);
            System.out.println("First name: " + name2);

      }

}
