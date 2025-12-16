import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para o fatorial: ");

        int numero = scanner.nextInt();
        int fatorial = 1;

        if(numero == 0 || numero == 1) {
            System.out.printf("Fatorial de %d é: %d", numero, fatorial);
            return;
        }




        for(int i = 1; i<= numero; i++) {
            fatorial *= i;

        }
        System.out.printf("Fatorial de %d é: %d ", numero, fatorial);












      scanner.close();

    }
}