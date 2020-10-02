import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Write your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, dear " + name + "!");
    }
}