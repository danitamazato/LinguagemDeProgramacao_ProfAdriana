//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

public class Exercicio14 {
    public static void main(String[] args) {
        int horaInicio = 18;
        int horaFim = 21;

        int duracaoJogo;

        if (horaInicio <= horaFim) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo de xadrez é de " + duracaoJogo + " horas.");
    }
}
