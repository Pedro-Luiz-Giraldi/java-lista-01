import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Milhas: ");
        Double milhas = scanner.nextDouble();

        System.out.println("Kilometros: " + milhas*1.609);

        scanner.close();
    }
}
