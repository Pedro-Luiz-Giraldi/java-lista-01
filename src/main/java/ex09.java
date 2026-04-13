import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = 3.14 * (raio * raio);

        System.out.println("Área do círculo: " + Math.round(area));
    }
}
