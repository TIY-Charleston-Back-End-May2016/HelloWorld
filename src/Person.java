import java.util.Arrays;

/**
 * Created by zach on 5/16/16.
 */
public class Person {
    static final int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];
    Email email;

    public Person() {

    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        //if (isValidName(newName)) {
            name = newName;
        //}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                ", email=" + email +
                '}';
    }
}
