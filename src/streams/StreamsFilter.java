package src.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsFilter {

    public static void main(String[] args) {

        List<String> filteredAnimals = Stream.of("Cat", "Dog", "Mouse", "Bird", "Tiger", "Lion")
                .filter(animal -> animal.length() > 3)
                .filter(animal -> {
                    System.out.println("Filtered animal: " + animal);
                    boolean animalContainsI = animal.contains("o");
                    return animalContainsI;
                    // ODER:
                    // return animal.contains("o");
                })
                .toList();

        System.out.println(filteredAnimals);

    }
}
