package academy.devcsilva.maratonajava.javacore.Oexcption.exception.test;

import academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain.Funcionario;
import academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain.LoginInvalidoException;
import academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
