package academy.devcsilva.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //While, Do While e for.
        int count = 0;
        while(count < 10){
            System.out.println(count); //(++count); -> acrescenta antes de imprimir.
            count = count + 1; //-> é a mesma coisa que: count += 1, ou count++
        }
        System.out.println("------------------------------------");

        count = 0;
        do {
            System.out.println("Dentro do Do-While "+ ++count);
        }while (count < 10);

        System.out.println("------------------------------------");

        for(int i = 0 ; i < 10; i++){
            System.out.println("For "+ i);
        }
    }
}
