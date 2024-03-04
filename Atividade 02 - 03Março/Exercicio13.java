//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class Exercicio13 {
    public static void main(String[] args) {
        int valor1 = 20; 
        int valor2 = 10;

        int menorValor, maiorValor;

        if (valor1 < valor2) {
            menorValor = valor1;
            maiorValor = valor2;
        } else {
            menorValor = valor2;
            maiorValor = valor1;
        }

        System.out.println("Os valores em ordem crescente são: " + menorValor + ", " + maiorValor);
    }
}
