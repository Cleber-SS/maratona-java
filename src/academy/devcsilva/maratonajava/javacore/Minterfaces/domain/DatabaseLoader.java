package academy.devcsilva.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados ");
    }
}
