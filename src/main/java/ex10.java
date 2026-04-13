import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Palavra: ");
        String palavra = scanner.nextLine();

        int qtdVogais = 0;
        int qtdConsoantes = 0;
        int qtdBrancos = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                qtdVogais++;
            } else if (c == ' ') {
                qtdBrancos++;
            } else {
                qtdConsoantes++;
            }
        }

        System.out.println("Vogais: " + qtdVogais);
        System.out.println("Consoantes: " + qtdConsoantes);
        System.out.println("Em Branco: " + qtdBrancos);
    }
}