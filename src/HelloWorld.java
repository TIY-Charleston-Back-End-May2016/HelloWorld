import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zach on 5/18/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = names.get(0);

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 3);

        int score = scores.get("Bob");
    }
}
