package src.streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAndCollections {

    public static void main(String[] args) {

        var animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");

        Stream<String> animalstream = animals.stream();
        String collectedAnimals = animalstream
                .collect(Collectors.joining(";"));

        System.out.println(collectedAnimals);

        // Funktioniert nicht, da ein stream, der schon einmal erzeugt wurde, nicht nochmal verwendet werden kann
        // String collectedAnimals2 = animalstream
        //        .collect(Collectors.joining(": "));

        String collectedAnimals2 = animals.stream()
                .collect(Collectors.joining(": "));

        System.out.println(collectedAnimals2);

        Set<String> animalsSet = animals.stream()
                .collect(Collectors.toSet());

        Map<Integer, Long> collectedAnimalCounts = animals.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(collectedAnimalCounts);
    }
}
