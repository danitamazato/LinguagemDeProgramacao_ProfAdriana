// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F 

public class Exercicio6 {
    public static void main(String[] args) {
        double fahrenheit = 250.0;

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("A temperatura em graus Celsius é: " + celsius + "°C");
    }
}