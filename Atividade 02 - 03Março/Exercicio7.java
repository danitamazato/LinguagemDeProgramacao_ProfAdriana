// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

public class Exercicio7 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);

        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
