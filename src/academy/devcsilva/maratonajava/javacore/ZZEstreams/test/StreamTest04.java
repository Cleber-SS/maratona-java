package academy.devcsilva.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devSilva = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei", "Suane", "Catarina", "Sandy");
        List<String> developers = List.of("Cleber", "Binho", "Harry");
        List<String> students = List.of("Gustavo Lima", "Epico", "Gustavo Mendes", "Guilherme");
        devSilva.add(graphicDesigners);
        devSilva.add(developers);
        devSilva.add(students);

        for (List<String> people : devSilva) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        System.out.println("------------------");
        devSilva.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
