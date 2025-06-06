import java.util.*;
import java.util.stream.Collectors;

public class Info {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Ravi", Gender.MALE),
            new Person("Aryan", Gender.MALE),
            new Person("Aadesh", Gender.FEMALE)
        );
        List<Person> females = new ArrayList<> ();
//        for(Person p : people) {
//            if(Gender.FEMALE.equals(p.gender)) females.add(p);
//        }
//        for(Person p : people) {
//            System.out.println(p);
//        }
        people.stream().filter(p -> Gender.FEMALE.equals(p.gender)).
                collect(Collectors.toList()).
                forEach(System.out::println);
    }
    static class Person {
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        public String toString() {
            return "Person { Name: " + this.name +  " & Gender: " + gender + " }";
        }
    }
    enum Gender{
        MALE,
        FEMALE
    }
}