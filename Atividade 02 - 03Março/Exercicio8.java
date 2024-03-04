// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 

public class Exercicio8 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);

        if (valor >= 0) {
            System.out.println("O valor é positivo ou zero.");
        } else {
            System.out.println("O valor é negativo.");
        }
    }
}
