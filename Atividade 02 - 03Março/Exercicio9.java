// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.  

public class Exercicio9 {
    public static void main(String[] args) {
        int numeroMaças = 20;

        double custoPorMaça;

        if (numeroMaças < 12) {
            custoPorMaça = 1.30;
        } else {
            custoPorMaça = 1.00;
        }

        double custoTotal = numeroMaças * custoPorMaça;

        System.out.println("O custo total da compra é: R$" + custoTotal);
    }
}
