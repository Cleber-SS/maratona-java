package academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionario");
    }
}
