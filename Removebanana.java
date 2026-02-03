import java.util.ArrayList;

public class Removebanana {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
                i--;
            }
        }
        System.out.println("Fruits: " + fruits);
    }
}