package intermediarios;

import java.util.Scanner;

public class FlexaEscudoEspada {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        int soma = jogadaJogador + jogadaInimigo;
        if ((jogadaJogador == jogadaInimigo) && soma < 7) {
            System.out.println("Empatou");
        } else if ((jogadaJogador == 1 && jogadaInimigo == 2) ||
                (jogadaJogador == 2 && jogadaInimigo == 3) ||
                (jogadaJogador == 3 && jogadaInimigo == 1)) {
            System.out.println("Perdeu");
        } else if (jogadaJogador > 3 || jogadaInimigo > 3 || soma > 6) {
            System.out.println("Jogada(s) inválidas");
        } else {
            System.out.println("Ganhou");
        }

    }
}
