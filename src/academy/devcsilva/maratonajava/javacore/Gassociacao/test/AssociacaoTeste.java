package academy.devcsilva.maratonajava.javacore.Gassociacao.test;

import academy.devcsilva.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devcsilva.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devcsilva.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devcsilva.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
