import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Palavra: ");
        String palavra = scanner.next();

        char[] palavraArray = palavra.toCharArray();

        int j = palavra.length() - 1;
        for (int i = 0; i < palavra.length(); i++) {
            palavraArray[i] = palavra.charAt(j);
            j--;
        }

        String palavraInvertida = new String(palavraArray);

        System.out.println("Palavra invertida: " + palavraInvertida);

        if (palavra.equals(palavraInvertida)) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }
    }
}
