import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<Person> people = getPeople();


    //IMPERATIVE APPROACH

    List<Person> femalesWithImperative = new ArrayList<>();

    for (Person person : people) {

        if (person.getGender().equals(Gender.FEMALE)) {
            femalesWithImperative.add(person);
        }
    }

    femalesWithImperative.forEach(System.out::println);

    //DECLARATIVE APPROACH - use streams

        List<Person> malesWithDeclarative = people.stream()
                //what you want: I want the people with Gender = Male
                .filter(person -> person.getGender().equals(Gender.MALE))
                //collect to a list
                .collect(Collectors.toList());

        malesWithDeclarative.forEach(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person ("James Bond", 20, Gender.MALE),
                new Person ("Alina Smith", 33, Gender.FEMALE),
                new Person ("Helen White", 57, Gender.FEMALE),
                new Person ("Alex Boz", 14, Gender.MALE),
                new Person ("Jamie Goa", 88, Gender.FEMALE),
                new Person ("Anna Cook", 7, Gender.FEMALE),
                new Person ("Zafro Brown", 28, Gender.MALE)

        );
    }
}
