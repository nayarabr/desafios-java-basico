package intermediarios;

import java.util.*;

public class NumeroFeliz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean feliz = false;

        Set<Integer> resultado = new HashSet<>();

        resultado.add(n);

        while (n != 1) {
            n = somaQuadradosDigitos(n);
            if (resultado.contains(n)) {
                n = 0;
                break;
            }
            resultado.add(n);

        }

        if(n == 1) {
            feliz = true;
        }

        if (n == 0) {
            feliz = false;
        }
        System.out.println(feliz);

    }

    private static int somaQuadradosDigitos(int n) {

        int q = 0;

        String numero = Integer.toString(n);

        char[] d = numero.toCharArray();

        for (int i = 0; i <d.length; i++) {

            int digito = n % 10;

            q += digito * digito;

            n = n / 10;

        }

        return q;

    }
}
