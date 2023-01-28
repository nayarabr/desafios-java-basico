package intermediarios;

import java.util.Scanner;

public class QuantidadeNecessariaCerto {

    public static void main(String[] args) {

        final int SLICE = 4;

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int count = 1; count <= T; count++) {

            double N = scanner.nextInt() * scanner.nextInt();

            double X = Math.ceil(N / SLICE);

            System.out.println((int) X);

        }
    }
}
