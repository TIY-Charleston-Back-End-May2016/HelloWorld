import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zach on 5/26/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Email e1 = new Email("Hi", "", "alice@theironyard.com");
        Email e2 = new Email("Hi", "", "bob@theironyard.com");
        Email e3 = new Email("Hi", "", "charlie@theironyard.com");
        Email e4 = new Email("Hi", "", "alice@theironyard.com");
        Email e5 = new Email("Hi", "", "bob@theironyard.com");

        Email[] emails = {e1, e2, e3, e4, e5};

        // hashmap organizing the emails by destination
        // "alice@theironyard.com" -> [e1, e4]
        // "bob@theironyard.com" -> [e2, e5]
        // "charlie@theironyard.com" -> [e3]

        HashMap<String, ArrayList<Email>> map = new HashMap<>();
        for (Email email : emails) {
            ArrayList<Email> arr = map.get(email.destination);
            if (arr == null) {
                arr = new ArrayList<>();
                arr.add(email);
                map.put(email.destination, arr);
            }
            else {
                arr.add(email);
            }
        }
        System.out.println(map);

        // alternative solution

        map = new HashMap<>();
        for (Email email : emails) {
            if (!map.containsKey(email.destination)) {
                map.put(email.destination, new ArrayList<>());
            }
            ArrayList<Email> arr = map.get(email.destination);
            arr.add(email);
        }
        System.out.println(map);
    }
}
