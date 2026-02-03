import java.util.ArrayList;

public class countPizza{
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pizza");

        int pizzaCount = 0;
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).equals("Pizza")) {
                pizzaCount++;
            }
        }
        System.out.println("Pizza Count: " + pizzaCount);
    }
    }