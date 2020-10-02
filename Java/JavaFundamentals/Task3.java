import java.util.Scanner;
import java.util.Random;

class Task3 {
  public static void main(String[] args) {

    System.out.println("Write the quantity of random numbers: ");
    Scanner scanner = new Scanner(System.in);
    int quantity = scanner.nextInt();
    getRandomNumbers(quantity);
  }

  public static void getRandomNumbers(int quantity) {
    int[] a = new int[quantity];
    for (int i = 1; i <= quantity; i++) {
      if (quantity < 10) {
        System.out.println("number(" + i + ") = " + Math.random());
      } else {
        System.out.print("number(" + i + ") = " + Math.random() + "  ");
      }
    }
  }
}