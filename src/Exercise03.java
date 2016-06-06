import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by zach on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward"};

        // ArrayList<String> that contains the names with only capital letters
        // remove names that don't start with "A"
        // ["ALICE", "ANDREW"]

        // solution 1: modify index after removing
        ArrayList<String> newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        for (int i = 0; i < newNames.size(); i++) {
            String name = newNames.get(i);
            if (!name.startsWith("A")) {
                newNames.remove(i);
                i--;
            }
        }
        System.out.println(newNames);

        // solution 2: use temporary collections
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : newNames) {
            if (name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        System.out.println(tempNames);

        // solution 3: use iterator
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        Iterator<String> iter = newNames.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(newNames);

        // solution 4: use a stream
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name);
        }
        newNames = newNames.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(newNames);
    }
}
