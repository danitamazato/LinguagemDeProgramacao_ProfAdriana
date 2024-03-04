// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.  

public class Exercicio4 {
    public static void main(String[] args) {
        double custoFabrica = 40000.0;

        double porcentagemDistribuidor = 0.28;

        double porcentagemImpostos = 0.45;

        double custoDistribuidor = custoFabrica * porcentagemDistribuidor;
        double custoImpostos = custoFabrica * porcentagemImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        System.out.println("O custo final ao consumidor é: R$" + custoFinal);
    }
}
