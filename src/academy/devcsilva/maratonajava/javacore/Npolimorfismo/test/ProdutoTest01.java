package academy.devcsilva.maratonajava.javacore.Npolimorfismo.test;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Salada", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
