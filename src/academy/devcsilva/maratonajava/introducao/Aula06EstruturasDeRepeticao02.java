package academy.devcsilva.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprimir todos números pares de 0 até 100

        for (int i = 1; i <= 100; i++) { //-> ou colocar ;i+2 após a condição <=100){
            if(i % 2 == 0) {
                System.out.println("Número " + i);
            }
        }
    }
}
