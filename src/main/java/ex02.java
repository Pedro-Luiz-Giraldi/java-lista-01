import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int primeiroNum = scanner.nextInt();

        System.out.println("Segundo número: ");
        int segundoNum = scanner.nextInt();

        if (primeiroNum > segundoNum) {
            System.out.println(primeiroNum + " é maior!");

        } else if (segundoNum > primeiroNum) {
            System.out.println(segundoNum + " é maior!");

        } else {
            System.out.printf("%d e %d são iguais!", primeiroNum, segundoNum);

        }
    }
}
