package basicos;

import java.util.Scanner;

public class FilaBanco {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nomesFila.length ; i++){
            String nome = scan.next();
            nomesFila[i] = nome;
        }

        for (int i = 0; i < nomesFila.length ; i++){
            String nome = nomesFila[i];
            System.out.println(nome + " - esta na posicao: " + (i+1));
        }
    }
}
