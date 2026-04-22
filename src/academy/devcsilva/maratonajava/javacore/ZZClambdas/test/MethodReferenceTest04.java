package academy.devcsilva.maratonajava.javacore.ZZClambdas.test;

import academy.devcsilva.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devcsilva.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor.
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 53),
                new Anime("One Piece", 480),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes); //o mesmo que a linha de baixo.
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super Campeões", 36));
    }
}
