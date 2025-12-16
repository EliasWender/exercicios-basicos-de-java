import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para a tabuada: ");
        int n = sc.nextInt();
        for(int i = 0; i<= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }


        System.out.println("Fim do programa.");
        sc.close();

        }

}