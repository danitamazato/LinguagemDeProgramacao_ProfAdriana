// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

public class Exercicio1 {
    public static void main(String[] args) {
        int anos = 33;
        int meses = 9;
        int dias = 25;

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade equivalente, em dias: " + idadeEmDias + " dias");
    }
}