import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        
        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número do dia da semana: ");
        int dia = scanner.nextInt();

        if (dia >= 1 && dia <= 7) {
            System.out.println("Dia: " + diasSemana[dia-1]);
        } else {
            System.out.println("Valor inválido!");
        }

    }
}
