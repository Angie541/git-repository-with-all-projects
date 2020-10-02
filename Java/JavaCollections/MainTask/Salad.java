import java.util.*;
import javax.swing.plaf.synth.SynthToolTipUI;
import sun.tools.jstat.SymbolResolutionClosure;
import java.util.Arrays.toString;

class Salad {
    public static void main(String[] args) {
        BasicVegetablesForSalad tomato = new BasicVegetablesForSalad("Tomato", "red", 24);
        BasicVegetablesForSalad cucumber = new BasicVegetablesForSalad("Cucumber", "green", 15);
        ExtraVegetablesForSalad corn = new ExtraVegetablesForSalad("Corn", "yellow", 96, 1);
        ExtraVegetablesForSalad radish = new ExtraVegetablesForSalad("Radish", "pink", 16, 2);
        ExtraVegetablesForSalad lettuce = new ExtraVegetablesForSalad("Lettuce", "green", 13, 2);

        ArrayList<Vegetables> salad = new ArrayList<Vegetables>();
        salad.add(tomato);
        salad.add(cucumber);
        salad.add(corn);
        salad.add(radish);
        salad.add(lettuce);

        // Enumeration + Sum of Calories
        int sum = 0;
        System.out.println("Our Salad contains: ");
        for (Vegetables v : salad) {
            System.out.println(v);
            sum += v.getCalorieContent();
        }
        System.out.println("\nThe number of calories in the salad: " + sum);

        // Sort
        Comparator<Vegetables> theNumberOfCalories = new Comparator<Vegetables>() {
            public int compare(Vegetables vegetable1, Vegetables vegetable2) {
                return vegetable1.calorieContent - vegetable2.calorieContent;
            }
        };

        System.out.println("\nSort vegetables by calories: ");
        Collections.sort(salad, theNumberOfCalories);
        for (Vegetables v : salad) {
            System.out.println(v);
        }

        // Vegetables by Calorie range
        int minCalorieContent = 10;
        int maxCalorieContent = 20;

        System.out.println(
                "\nVegetables by Calorie range (from " + minCalorieContent + " to " + maxCalorieContent + "): ");
        for (Vegetables v : salad) {
            if (v.calorieContent > minCalorieContent && v.calorieContent < maxCalorieContent) {
                System.out.print(v.name + "    ");
            }
        }
    }
}
