import java.util.Scanner;

class Task4 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Write the second number: ");
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        int multiplicationResult = firstNumber * secondNumber;

        System.out.println("Sum result is " + sumResult);
        System.out.println("Multiplication result is " + multiplicationResult);

    }
}