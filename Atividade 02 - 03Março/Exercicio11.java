// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

public class Exercicio11 {
    public static void main(String[] args) {
        int anoAtual = 2024;
        int anoNascimento = 1990;

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Esta pessoa poderá votar este ano.");
        } else {
            System.out.println("Esta pessoa não poderá votar este ano.");
        }
    }
}
