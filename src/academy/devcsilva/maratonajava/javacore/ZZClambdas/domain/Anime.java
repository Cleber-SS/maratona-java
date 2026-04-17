package academy.devcsilva.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int epidodes;

    public Anime(String title, int epidodes) {
        this.title = title;
        this.epidodes = epidodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + epidodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpidodes() {
        return epidodes;
    }
}
