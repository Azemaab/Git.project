import java.util.ArrayList;


public class UniqueBooks {
    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Java");
        books1.add("Python");
        books1.add("C++");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Python");
        books2.add("Ruby");
        books2.add("Java");

        for (int i = 0; i < books2.size(); i++) {
            if (!books1.contains(books2.get(i))) {
                books1.add(books2.get(i));
            }
        }
        System.out.println("Merged Books: " + books1);
    }
}

