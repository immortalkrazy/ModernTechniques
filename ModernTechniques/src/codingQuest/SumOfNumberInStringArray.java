package codingQuest;

public class SumOfNumberInStringArray {

      public static void main(String[] args) {

            String arr[] = { "2AA", "B3C", "Z27", "LM6", "BAC" };

            System.out.println("hello");

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {

                  String strElement = arr[i];

                  for (int j = 0; j < strElement.length() - 1; i++) {

                        if (Character.isDigit(strElement.charAt(j))) {

                              sum = sum + Integer.parseInt(strElement.charAt(j) + "");
                        }
                  }
            }

//             int result = sumOfNumbers(arr);

            System.out.println(sum);

      }

//      public static int sumOfNumbers(String[] strArray) {
//
//            int sum = 0;
//
//            for (int i = 0; i < strArray.length; i++) {
//
//                  String strElement = strArray[i];
//                  for (int j = 0; j < strElement.length(); i++) {
//                        if (Character.isDigit(strElement.charAt(j))) {
//                              sum = sum + Integer.valueOf(strElement.charAt(j));
//                        }
//                  }
//            }
//
//            return sum;
//      }

}
