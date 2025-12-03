package academy.devcsilva.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando o Swich
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //Considerando 1 como domingo.
        byte dia = 1;
        String util = "Dia útil.";
        String fds = "Final de semana.";
        switch (dia){
            case 1:
            case 7:
                System.out.println(fds);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(util);
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }
}
