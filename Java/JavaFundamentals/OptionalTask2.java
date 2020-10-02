import java.util.*;

class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of your array: ");
        int size = scanner.nextInt();
        int arrayOfNumbers[] = new int[size];

        System.out.println("Write some numbers separated by Enter: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(arrayOfNumbers);
        System.out.println("Modified array : " + Arrays.toString(arrayOfNumbers));
    }
}