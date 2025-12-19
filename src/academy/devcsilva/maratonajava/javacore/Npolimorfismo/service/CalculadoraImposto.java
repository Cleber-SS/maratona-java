package academy.devcsilva.maratonajava.javacore.Npolimorfismo.service;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
