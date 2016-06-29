import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by zach on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws FileNotFoundException {
        // parse people.csv into ArrayList<String> that contain first and last names separated by a space
        // prompt the user for search term
        // print out the names that contain the term

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("people.csv"));
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Type search term:");
        String searchTerm = consoleScanner.nextLine();

        // solve via for loop
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(name);
            }
        }

        System.out.println();

        // solve via stream
        names = names.stream()
                .filter(name -> name.toLowerCase().contains(searchTerm.toLowerCase()))
                //.forEach(System.out::println);
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(names);
    }
}
