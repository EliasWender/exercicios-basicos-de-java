

public class Main {

        public static void main(String[] args) {
            int n = 10;
            int primeiroTermo = 0, segundoTermo = 1;


            for(int i = 0; i< n; i++) {
                System.out.println(primeiroTermo); //
                int proximo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximo;




            }
        }
    }

