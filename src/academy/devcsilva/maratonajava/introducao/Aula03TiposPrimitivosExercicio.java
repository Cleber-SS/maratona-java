package academy.devcsilva.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Kirito";
        String endereco = "Av João Dias, casa 1, São Paulo-SP";
        double salario = 5432.15;
        String dataRecebimento = "02/06/2025";
        String relatorio = "Eu, "+nome+ " morando no endereço "+endereco+ ",\n" +
                "confirmo que recebi o salário de "+salario+ ", na data "+dataRecebimento+".";
        System.out.println(relatorio);
    }
}
