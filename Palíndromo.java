import java.util.Scanner;

public class Palíndromo{

    public static void main(String[] anrgs){

        Scanner p1 = new Scanner(System.in);

        System.out.println("Digite a palavra/frase: ");
        String palavra = p1.nextLine();
        String palindromo = "";

        for (int i = palavra.length() -1; i >= 0; i--){
            palindromo += palavra.charAt(i);

            //System.out.println("Palindromo"+"\n"+palindromo);
        }
        if(palindromo.equals(palavra)) {
            System.out.println("É um palíndromo: " + "\n" + palindromo);
        }
        else {
            System.out.println("Não é um palíndromo: " + "\n" + palindromo);
        }
        
    }
}
