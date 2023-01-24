import java.util.Scanner;

public class MediaIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a idade 1: ");
        int idade1 = leitor.nextInt();
        System.out.println("Insira a idade 2: ");
        int idade2 = leitor.nextInt();
        System.out.println("Insira a idade 3: ");
        int idade3 = leitor.nextInt();

        int media =((idade1 + idade2 + idade3) / 3);

        System.out.println("A média da turma é: " + media);

        if (media >=0 && media <=25) {
            System.out.println("Jovem!");
        } else if (media >=26 && media <=60) {
            System.out.println("Adulta!");
        } else if (media > 60){
            System.out.println("Idosa!");
        } else {
            System.out.println("Média Inválida!");
        }
    }
}
