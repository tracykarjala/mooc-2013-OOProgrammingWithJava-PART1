import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person: list) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        String number = "";
        for (Person person: list) {
            if (person.getName().equals(name)) {
                number += person.getNumber();
            }
        }
        if (number.length() == 0) {
            return "number not found";
        } else {
            return number;
        }
    }
}
