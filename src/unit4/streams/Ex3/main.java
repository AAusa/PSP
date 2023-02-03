package unit4.streams.Ex3;

import static java.util.Arrays.asList;

public class main {
    public static void main(String[] args) {
        Country france = new Country("France", 65_235_184L);
        Country canada = new Country("Canada", 37_653_095L);
        Country uk = new Country("United Kingdom", 67_791_734L);

        var people = asList(
                new Person("John", 50, new Gender("Male"), france),
                new Person("May", 12, new Gender("Male"), canada),
                new Person("Tiff", 23, new Gender("Female"), uk),
                new Person("Azul", 15, new Gender("Male"), france),
                new Person("Samantha", 67, new Gender("Female"), canada));


        people.stream()
                .map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);

        people.stream()
                .filter(p -> p.getName().length() < 4)
                .forEach(n -> System.out.println(n.getName()));

        //3

        people.stream()
                .mapToInt(p -> p.getAge())
                .max()
                .ifPresent(x -> System.out.println(x));

        System.out.println(people.stream()
                .mapToInt(p -> p.getAge())
                .sum());


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

        people.stream()
                .filter(p -> p.getAge() < 18)
                .forEach(n -> System.out.println(n.getName()+"<18"));
        people.stream()
                .filter(p -> p.getAge() >= 18)
                .forEach(n -> System.out.println(n.getName()+">=18"));

        people.stream()
                .filter(p -> p.getCountry().getName().equals("Canada"))
                .forEach(n -> System.out.println(n.getName()));
        people.stream()
                .filter(p -> p.getCountry().getName().equals("France"))
                .forEach(n -> System.out.println(n.getName()));
        people.stream()
                .filter(p -> p.getCountry().getName().equals("United Kingdom"))
                .forEach(n -> System.out.println(n.getName()));

        people.stream()
                .forEach(n -> System.out.print(n.getName()+"_"));

        people.stream()
                .filter(p -> p.getCountry().getName().equals("Canada"))
                .filter(p -> p.getGender().getGender().equals("Male"))
                .forEach(n -> System.out.println("\n"+n.getName()));
    }
}
