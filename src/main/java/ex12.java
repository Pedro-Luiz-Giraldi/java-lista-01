import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de tanques: ");
        int qtdTanques = scanner.nextInt();

        List<Integer> kilometros = new ArrayList<>();
        List<Integer> litros = new ArrayList<>();

        for (int i = 0; i < qtdTanques; i++) {
            System.out.print("Kilometros tanque "+(i+1)+": ");
            int kms = scanner.nextInt();
            kilometros.add(kms);

            System.out.print("Litros tanque "+(i+1)+": ");
            int lts = scanner.nextInt();
            litros.add(lts);
        }

        System.out.println("\n===========================================");

        int totalKm = 0;
        int totalLt = 0;

        for (int i = 0; i < kilometros.size(); i++) {
            System.out.println("Kilometros por litro (Tanque "+(i+1)+"): " + (double) kilometros.get(i) / litros.get(i));
            totalKm += kilometros.get(i);
            totalLt += litros.get(i);
        }
        System.out.println("Total de Kilometros: " + totalKm);
        System.out.println("Total de Litros: " + totalLt);
    }
}
