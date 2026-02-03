import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practises2 {

    public static void main(String[] args) {

        // 11. Find Common Elements
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("USA", "Kyrgyzstan", "UK"));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("India", "Kyrgyzstan"));

        ArrayList<String> common = new ArrayList<>();
        for (String s : countries1) {
            if (countries2.contains(s)) {
                common.add(s);
            }
        }
        System.out.println("Common Countries: " + common);

        // 12. Remove Even-Length Strings
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Azema", "Asel", "Aisezim"));
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }
        System.out.println("Names: " + names);

        // 13. Find Shortest String
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("DNA", "Raindance", "Lola"));
        String shortest = songs.getFirst();

        for (int i = 1; i < songs.size(); i++) {
            if (songs.get(i).length() < shortest.length()) {
                shortest = songs.get(i);
            }
        }
        System.out.println("Shortest Song: " + shortest);

        // 14. Replace All Vowels
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        words.replaceAll(s -> s.replaceAll("[AEIOUaeiou]", "*"));
        System.out.println("Words after replacing vowels: " + words);

        // 15. Partition Even and Odd
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        // 16. Rotate Elements
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri"));
        Collections.rotate(days, 2);
        System.out.println("Rotated Days: " + days);

        // 17. Remove Null Values
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Saikal", null, "Adilet"));
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == null) {
                students.remove(i);
                i--;
            }
        }
        System.out.println("Students: " + students);

        // 18. Second-Largest String (by length)
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Up", "Avatar", "Interstellar"));
        movies.sort((a, b) -> b.length() - a.length());
        System.out.println("Second Largest Movie: " + movies.get(1));

        // 19. Replace Strings with Lengths
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Kiwi"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }
        System.out.println("Fruit Lengths: " + lengths);

        // 20. Nested ArrayList
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> dept1 = new ArrayList<>(Arrays.asList("Erkinbubu", "Marlis"));
        ArrayList<String> dept2 = new ArrayList<>(Arrays.asList("Altynai", "Meerim"));

        departments.add(dept1);
        departments.add(dept2);

        System.out.println("Departments:");
        for (ArrayList<String> department : departments) {
            System.out.println(department);
        }
    }
}

