import java.util.*;

class OptionalTaskNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(-23);
        numbers.add(-2);
        numbers.add(-7);

        System.out.println("Befort sort:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        Comparator<Integer> compareNumbers = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return Integer.compare(num2, num1);
            }
        };

        Collections.sort(numbers, compareNumbers);
        System.out.println("Sorted numbers:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}