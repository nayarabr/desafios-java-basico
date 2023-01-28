package intermediarios;

import java.util.Scanner;

public class DiferencaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int produto = 1;
        int soma = 0;
        int diferenca = 0;

        String numero = Integer.toString(n); // transforma o inteiro em string
        char[] d = numero.toCharArray(); // transforma a string em char

        for (int count = 0; count <d.length; count++) {
            int i = Integer.parseInt(String.valueOf(d[count])); // transforma cada item do char em inteiro para conseguir fazer a operação
            soma += i;
            produto = produto * i;
        }
        System.out.println(soma);
        System.out.println(produto);
        System.out.println("Diferença: " + (produto - soma));
    }
}
