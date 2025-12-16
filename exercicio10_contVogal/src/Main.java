 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( " Digite uma palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.replaceAll("", "").toLowerCase();
        int quantidadeVogais = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < palavra.length(); i++) {
            if(vogais[i] == palavra.charAt(palavra.length() -1 -i)){

                quantidadeVogais ++;
            }


        }
        System.out.println(quantidadeVogais);

        }
    }
