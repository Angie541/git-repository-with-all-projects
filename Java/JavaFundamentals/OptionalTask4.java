import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;

class OptionalTask4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Write some numerals (separated by commas without spaces): ");
    String rowOfNumerals = scanner.nextLine();

    for (String numeral : rowOfNumerals.split(",")) {
      System.out.println("Your numeral :" + numeral);
      char array[] = numeral.toCharArray();

      Arrays.sort(array);
      System.out.println("Modified array of digits : " + Arrays.toString(array));

      int result = 0;
      int numberOfAllDigits = 0;
      int numberOfRepeatingDigits = 0;

      for (int i = 0; i < array.length; i++) {
        numberOfAllDigits++;
        for (int j = i + 1; j < array.length; j++) {
          if (array[i] == array[j]) {
            numberOfRepeatingDigits++;
          }
        }
      }

      if (numberOfRepeatingDigits != 0) {
        result = (numberOfAllDigits - numberOfRepeatingDigits) + 1;
      } else {
        result = numberOfAllDigits;
      }

      System.out.println("Number of all digits is " + numberOfAllDigits);
      System.out.println("Number of repeating digits is " + numberOfRepeatingDigits);
      System.out.println("The Result is " + result);
      System.out.println(" ");

      for (int j = 1; j <= 9; j++) {
        if (result == j) {
          System.out.println(numeral);
          break;
        }
      }
    }
  }
}
