import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                }
            }
        }
    }
}