import java.util.Scanner;

class Task2 {
    public static void main(String[] arg) {
        System.out.println("Write a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("A previous version: " + word);
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println("That's how your word looks like backwards: " + reverse);

    }
}
