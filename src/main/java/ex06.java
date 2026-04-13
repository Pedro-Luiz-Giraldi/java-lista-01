public class ex06 {

    public static void main(String[] args) {

        float total = 1;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                total *= i;
            }
        }

        System.out.println("Total: " + total);
    }
}
