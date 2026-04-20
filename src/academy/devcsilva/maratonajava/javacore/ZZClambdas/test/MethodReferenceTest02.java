package academy.devcsilva.maratonajava.javacore.ZZClambdas.test;

import academy.devcsilva.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devcsilva.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method od a particular object.
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 53),
                new Anime("One Piece", 480),
                new Anime("Naruto", 500)
        ));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
//        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2)); //o mesma que a linha de cima.
        System.out.println(animeList);
    }
}
