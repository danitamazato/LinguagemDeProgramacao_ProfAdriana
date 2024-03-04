// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. 

public class Exercicio5 {
    public static void main(String[] args) {
        int carrosVendidos = 20;

        double valorVendas = 100000.0;

        double salarioFixo = 2500.0;

        double valorPorCarro = 1000.0;

        double comissao = valorVendas * 0.05;

        double valorTotalPorCarro = carrosVendidos * valorPorCarro;

        double salarioFinal = salarioFixo + comissao + valorTotalPorCarro;

        System.out.println("O salário final do vendedor é: R$" + salarioFinal);
    }
}
