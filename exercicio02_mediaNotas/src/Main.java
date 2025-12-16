import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double mediaFinal = (nota1 + nota2 + nota3) / 2;

        if(mediaFinal >= 7) {
            System.out.println("Parabéns, aprovado.");
        }
        else{
            System.out.println("Reprovado. ");
        }

        System.out.println("Fim do programa.");
        sc.close();

        }

}