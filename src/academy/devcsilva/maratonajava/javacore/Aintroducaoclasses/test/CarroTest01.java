package academy.devcsilva.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devcsilva.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Hatch";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.nome = "Corolla";
        carro2.modelo = "Sedan";
        carro2.ano = 2023;

//        carro1 = carro2; //variável de referência.

        System.out.println("---------Carro 1----------");
        System.out.println("Nome: " + carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: " + carro1.ano);

        System.out.println("\n---------Carro 2----------");
        System.out.println("Nome: " + carro2.nome +
                "\nModelo: " + carro2.modelo +
                "\nAno: " + carro2.ano);

    }
}
