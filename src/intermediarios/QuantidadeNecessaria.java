package intermediarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuantidadeNecessaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaFatias = 0;
        int qtdPizzas = 0;

        //int t = scanner.nextInt();

        System.out.println("Insira a quantidade de amigos:");
        int a = scanner.nextInt(); //Número de amigos

        do {
            System.out.println("Insira a quantidade de fatias de pizza que cada amigo quer:");
            int x = scanner.nextInt(); //Quantidade de fatias que cada um quer
            somaFatias += x;
            a--;
        } while (a > 0);

        qtdPizzas = getQtdPizzas(somaFatias);

        System.out.println("Quantidade de pizzas: " + qtdPizzas);
        System.out.println("Quantidade de fatias: " + somaFatias);

    }

    private static int getQtdPizzas(int somaFatias) {
        final int SLICE = 4;
        if(somaFatias <= 4) {
            return 1;
        }
        if (somaFatias % 4 == 0 ) {
            return somaFatias / SLICE;
        }

        return  (somaFatias / SLICE) + 1;
    }
}
