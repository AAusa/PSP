package unit4.streams.Ex1;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static java.util.Arrays.asList;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = asList("John", "Jack", "Jacob");
        //names.forEach(n -> System.out.println("Hello "+n));
        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .filter((s) -> s.startsWith("Ja"))
                .forEach(System.out::println);


        List<Integer> list = asList(1, 2, 3, 4);
        list.stream()
                .filter((s) -> s % 2 == 0)
                .forEach(System.out::println);
        int sum = list.stream()
                .mapToInt(x->x)
                .sum();
        OptionalDouble avg = list.stream()
                .mapToDouble(x->x)
                .average();
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());
        OptionalInt max = list.stream()
                .mapToInt(x->x)
                .max();
        if (max.isPresent())
            System.out.println(max.getAsInt());
        int min = list.stream()
                .mapToInt(x->x)
                .min()
                .orElse(0);
        System.out.println(min);

        list.stream()
                .mapToInt(x->x)
                .min()
                .ifPresent(x -> System.out.println(x));



    }
}
