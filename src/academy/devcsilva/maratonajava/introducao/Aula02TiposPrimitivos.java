package academy.devcsilva.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        //char caractere = 87;
        char caractere = '\u0041';

        String nome = "Goku";

        System.out.println("A idade é: " +idade+" anos.");
        System.out.println(falso);
        System.out.println("char " +caractere);
        System.out.println("Oi, meu nome é " +nome);
    }
}
