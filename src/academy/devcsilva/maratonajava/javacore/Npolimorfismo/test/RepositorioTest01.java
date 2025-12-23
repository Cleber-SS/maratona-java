package academy.devcsilva.maratonajava.javacore.Npolimorfismo.test;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
