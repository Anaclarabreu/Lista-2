import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();
        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo)
            System.out.println(n + " e um numero primo.");
        else
            System.out.println(n + " nao e um numero primo.");

        scanner.close();
    }
}
