// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

public class Exercicio3 {
    public static void main(String[] args) {
        double salarioAtual = 2500.0;

        double percentualReajuste = 10.0; // 10% de reajuste

        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        System.out.println("O novo salário do funcionário após o reajuste é: R$" + novoSalario);
    }    
}
