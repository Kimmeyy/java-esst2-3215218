package src.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsMap {
    public static void main(String[] args) {
        List<String> animalCaps = Stream.of("Cat", "Dog", "Mouse", "Bird", "Tiger", "Lion")
                // Methodenreferenz mit ::
                .map(String::toUpperCase)
                // Lambda Expression mit ->
                .map(animal -> animal.toUpperCase())
                // Umwandlung der animals in "foobar"
                // .map(a -> "foobar")
                .toList();
        System.out.println(animalCaps);

        List<String> beginningLetters = Stream.of("Cat", "Dog", "Mouse", "Bird", "Tiger", "Lion", "")
                .filter(a -> a.length()>0)
                // ODER: .filter(a -> !a.isEmpty())
                .map(a -> a.substring(0, 1))
                .toList();
        System.out.println(beginningLetters);
    }
}
