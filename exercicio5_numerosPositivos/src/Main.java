import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int cont = 0;

        System.out.println("Quantos numeros deseja digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();


        }
        System.out.println("Números positivos");
        for(int i = 0; i< numeros.length; i++) {
            if(numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Fim do programa");
        sc.close();



    }
}