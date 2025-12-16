// Esse programa Mostra o maior número digitado pelo usuário.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double numero3 = sc.nextDouble();

        if(numero1 > numero2 && numero1 > numero3) {
            System.out.println("Maior numero: " + numero1);
        }
        else if(numero2 > numero3) {
            System.out.println("Maior numero: " + numero2);
        }
        else {
            System.out.println("Maior numero: " + numero3);
        }




        sc.close();
    }
}