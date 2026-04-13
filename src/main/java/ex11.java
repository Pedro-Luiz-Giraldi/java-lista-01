import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira palavra: ");
        String primeira = scanner.next();

        System.out.print("Segunda palavra: ");
        String segunda = scanner.next();

        if (primeira.compareTo(segunda) < 0) {
            System.out.printf("Palavras em ordem: %s, %s\n", primeira, segunda);
        } else {
            System.out.printf("Palavras em ordem: %s, %s\n", segunda, primeira);
        }

        if (primeira.length() > segunda.length()) {
            System.out.println(primeira + " é maior!");
        } else if (segunda.length() > primeira.length()){
            System.out.println(segunda + " é maior!");
        } else {
            System.out.printf("%s e %s tem o mesmo tamanho!", primeira, segunda);
        }
    }
}