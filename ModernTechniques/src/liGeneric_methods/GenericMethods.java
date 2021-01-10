package liGeneric_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

      static Character[] charArray = { 'h', 'e', 'l', 'l', 'o' };
      static Integer[] intArray = { 1, 2, 3, 4, 5 };
      static Boolean[] boolArray = { true, false, true };

      // return type is T
      // the type it takes the type it returns
      public static <T> List<T> arrayToList_Generic(T[] array, List<T> list) {

            for (T element : array) {
                  list.add(element);
            }

            return list;
      }

      // this is the non generic which can cause type casting issues

      public static List arrayToList_NonGeneric(Object[] array, List<Object> list) {

            for (Object object : array) {
                  list.add(object);
            }

            return list;
      }

      public static void main(String[] args) {

            List<Character> charList = arrayToList_Generic(charArray, new ArrayList<>());
            List<Integer> intList = arrayToList_Generic(intArray, new ArrayList<>());
            List<Boolean> boolList = arrayToList_Generic(boolArray, new ArrayList<>());

            System.out.println(charList);
            System.out.println(intList);
            System.out.println(boolList);
      }

}
