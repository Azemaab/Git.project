import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Practice {

    public static void main(String[] args) {

        // 5. Replace All Elements
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));
        Collections.fill(colors, "Black");
        System.out.println("Colors: " + colors);

        // 6. Check Sublist Presence
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Football", "Cricket", "Tennis"));
        ArrayList<String> sub = new ArrayList<>(Arrays.asList("Football", "Tennis"));

        if (sports.containsAll(sub)) {
            System.out.println("Sports list contains the sublist");
        } else {
            System.out.println("Sports list does not contain the sublist");
        }

        // 7. Find First & Last Index
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Lily", "Rose"));
        System.out.println("First index of Rose: " + flowers.indexOf("Rose"));
        System.out.println("Last index of Rose: " + flowers.lastIndexOf("Rose"));

        // 8. Remove Duplicates
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Dog", "Cat", "Dog"));
        ArrayList<String> uniqueAnimals = new ArrayList<>(new LinkedHashSet<>(animals));
        System.out.println("Animals without duplicates: " + uniqueAnimals);

        // 9. Convert ArrayList to Array
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "London"));
        String[] cityArray = cities.toArray(new String[cities.size()]);

        System.out.println("Cities Array:");
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println(cityArray[i]);
        }

        // 10. Convert Array to ArrayList
        Integer[] numbers = {1, 2, 3};
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("ArrayList from array: " + numberList);
    }
}
