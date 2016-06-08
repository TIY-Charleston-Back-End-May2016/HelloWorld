import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by zach on 6/8/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};

        // {"Smith": "Alice", "Jones": "Bob", "Brown": "Charlie"}

        // solution 1: traditional for loop
        HashMap<String, String> namesMap = new HashMap<>();
        for (int i = 0; i < names.length; i+=2) {
            String firstName = names[i];
            String lastName = names[i+1];
            namesMap.put(lastName, firstName);
        }
        System.out.println(namesMap);

        // solution 2
        namesMap = new HashMap<>();
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> pair;
        while (namesArr.size() > 0) {
            pair = new ArrayList<>(namesArr.subList(0, 2));
            namesArr = new ArrayList<>(namesArr.subList(2, namesArr.size()));
            namesMap.put(pair.get(1), pair.get(0));
        }
        System.out.println(namesMap);
    }
}
