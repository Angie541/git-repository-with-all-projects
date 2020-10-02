import java.util.*;

class OptionalTask3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Size of array: ");
    int size = scanner.nextInt();
    int array[] = new int[size];

    System.out.println("!Write numbers separated by space bar:");
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    int average = sum / size;
    System.out.println("Average length over all numbers: " + average);

    System.out.print("Numbers whose length is less than average length over all numbers:");
    for (int i = 0; i < size; i++) {
      if (average > array[i]) {
        System.out.print(array[i] + " ");
      }
    }
  }
}