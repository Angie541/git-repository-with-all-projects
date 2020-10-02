import java.util.Comparator;

class Vegetables {
    protected String name;
    protected String color;
    protected int calorieContent;
    protected int price;

    public Vegetables(String name, String colоr, int calorieContent) {
        this.name = name;
        this.color = colоr;
        this.calorieContent = calorieContent;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    @Override
    public String toString() {
        final StringBuffer printing = new StringBuffer();
        printing.append("Vegetable: ").append(name);
        printing.append("  (properties: ");
        printing.append("Color - ").append(color);
        printing.append(", Calorie content - ").append(calorieContent);
        printing.append(", Price - ").append(price).append(")");
        return printing.toString();
    }
}