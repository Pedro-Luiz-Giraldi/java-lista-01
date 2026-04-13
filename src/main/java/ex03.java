import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            boolean ePrimo = false;

            for (int j = 2; j <= i; j++) {

                if (i % j == 0 && i != j) {
                    break;
                } 

                ePrimo = true;
            }

            if (ePrimo) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
