package academy.devcsilva.maratonajava.javacore.ZZDoptional.test;

import academy.devcsilva.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devcsilva.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

    }
}
