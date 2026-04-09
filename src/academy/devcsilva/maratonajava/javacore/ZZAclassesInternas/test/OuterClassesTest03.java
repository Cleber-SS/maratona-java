package academy.devcsilva.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Cleber";

    static class Nested {
        private String lastName = "Silva";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
