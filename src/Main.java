import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    Employee[] employees = {
            new Employee(1234,"Jason", "Red", 5000, "IT"),
            new Employee(5433,"Ashley", "Green", 7600, "IT"),
            new Employee(2678,"Matthew", "Indigo", 3587.5, "Sales"),
            new Employee(12789,"James", "Indigo", 4700.8, "Marketing"),
            new Employee(4566,"Luke", "Indigo", 3400, "IT"),
            new Employee(10888,"Jason", "Blue", 3200, "Sales"),
            new Employee(12346,"Wendy", "Brown", 4265.6, "Administration")

    };

    List<Employee> listEmployee = Arrays.asList(employees);

    Predicate<Employee> ageBetweenFiveAndSeven = s -> (s.getSalary()>=5000 && s.getSalary()<=7000);

}
