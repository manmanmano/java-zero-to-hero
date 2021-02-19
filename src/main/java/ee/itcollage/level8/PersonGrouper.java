package ee.itcollage.level8;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
//      return people.stream().collect(Collectors.toMap(person -> person.getIdCode(), person -> person));
        return people.stream().collect(Collectors.toMap(Person::getIdCode, person -> person));
    }

    private static String getFullName(Person person){
        return format("%s %s", person.getFirstName(), person.getLastName());
    }

}
