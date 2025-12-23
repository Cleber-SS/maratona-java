package academy.devcsilva.maratonajava.javacore.Npolimorfismo.service;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
