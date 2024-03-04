//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.  

public class Exercicio12 {
    public static void main(String[] args) {
        int valor1 = 20;
        int valor2 = 30;

        int maiorValor;

        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }

        System.out.println("O maior valor é: " + maiorValor);
    }
}