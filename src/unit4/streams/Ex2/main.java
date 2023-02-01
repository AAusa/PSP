package unit4.streams.Ex2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 50));
        people.add(new Person("May", 12));
        people.add(new Person("Tiff", 23));
        people.add(new Person("Azul", 15));
        people.add(new Person("Samantha", 67));

        people.stream()
                .map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);

        people.stream()
                .filter(p -> p.getName().length() < 4)
                .forEach(n -> System.out.println(n.getName()));

        people.stream()
                .mapToInt(p -> p.getAge())
                .max()
                .ifPresent(x -> System.out.println(x));

        people.stream()
                .mapToInt(p -> p.getAge())
                .min()
                .ifPresent(x -> System.out.println(x));

        people.stream()
                .mapToInt(p -> p.getAge())
                .average()
                .ifPresent(x -> System.out.println(x));
        long count = people.stream()
                .mapToInt(p -> p.getAge())
                .count();
        System.out.println(count);
    }
}
