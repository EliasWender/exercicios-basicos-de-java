import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        int maiorNumero = random.nextInt(20);
        System.out.println(maiorNumero);
        System.out.println(" Número inicial");

        for(int i = 0; i < 20; i++) {
            int numero = random.nextInt(20);
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }

            System.out.println(numero);



        }
        System.out.println("Maior numero: " + maiorNumero);


    }
}