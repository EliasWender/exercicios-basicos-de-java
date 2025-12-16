//Esse programa mostra se um número é impar ou par.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();


        if (n1 % 2 == 0 ){
            System.out.println("Par ");

        }
        else {
            System.out.println("Impar ");
        }
        System.out.println("Fim do programa.");
        sc.close();
    }
}