 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra/frase para verificarmos se é um palindromo.");
        String palavra = sc.nextLine();

        palavra = palavra.replaceAll(" ", "").toLowerCase();
            boolean palindromo = true;
       for(int i = 0; i < palavra.length(); i++) {
           if(palavra.charAt(i) != palavra.charAt(palavra.length()-1 -i)) {
               palindromo = false;
               break;
           }




       }


        if(palindromo) {
            System.out.println("É um palindromo.");
        }
        else {
            System.out.println("Não é um palindromo.");
        }

        }
    }
