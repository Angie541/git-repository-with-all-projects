import java.util.*;

class OptionalTaskPoem {
    public static void main(String[] args) {
        ArrayList<String> poem = new ArrayList<String>();
        poem.add("No regrets, no tears and no complaining,");
        poem.add("All, like haze from apple trees, will pass.");
        poem.add("Taken by the gold of autumn waning,");
        poem.add("I will not be young again, alas.");

        System.out.println("Before sort:");
        for (int i = 0; i < poem.size(); i++) {
            System.out.println(poem.get(i));
        }

        Comparator<String> compareByLength = new Comparator<String>() {
            @Override
            public int compare(String line1, String line2) {
                return Integer.compare(line1.length(), line2.length());
            }
        };

        Collections.sort(poem, compareByLength);
        System.out.println("\nAfter sort:");
        for (int i = 0; i < poem.size(); i++) {
            System.out.println(poem.get(i));
        }
    }
}