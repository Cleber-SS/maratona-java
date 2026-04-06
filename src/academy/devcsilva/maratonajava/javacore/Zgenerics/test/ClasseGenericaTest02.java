package academy.devcsilva.maratonajava.javacore.Zgenerics.test;

import academy.devcsilva.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devcsilva.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devcsilva.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devcsilva.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
