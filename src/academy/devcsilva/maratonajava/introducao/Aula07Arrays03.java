package academy.devcsilva.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{10, 9, 8, 7, 6}; //mesma coisa que a linha de cima.

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        System.out.println("-------------ForEach---------------");

        int[] numeros4 = {5, 4, 3, 2, 1};

        for (int num : numeros4) {
            System.out.println(num);
        }
        //Foreach vai incrementar igual ao for, porém, não dar o tamanho e nem o índice do array.
    }
}
