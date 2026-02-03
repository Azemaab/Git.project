import java.util.ArrayList;

public class longestMovie {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Barbie");
        movies.add("Top gun");
        movies.add("Maze runner");

        String longestMovie = movies.getFirst();
        for (int i = 1; i < movies.size(); i++) {
            if (movies.get(i).length() > longestMovie.length()) {
                longestMovie = movies.get(i);
            }
        }
        System.out.println("Longest Movie: " + longestMovie);
    }
}