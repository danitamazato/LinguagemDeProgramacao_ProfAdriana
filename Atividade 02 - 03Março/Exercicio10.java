// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.  

public class Exercicio10 {
    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 7.5;

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é: " + media);

        if (media >= 6) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno não foi aprovado.");
        }
    }
}
