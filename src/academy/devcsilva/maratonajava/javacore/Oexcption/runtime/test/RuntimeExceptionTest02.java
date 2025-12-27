package academy.devcsilva.maratonajava.javacore.Oexcption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b divisor não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Número inválido! O divisor não pode ser zero");
        }
        return a / b;
    }
}
