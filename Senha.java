import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SenhaCorreta = 3590;
        int senha;

        do {
            System.out.print("Digite a senha de 4 numeros: ");
            senha = scanner.nextInt();

            if (senha != SenhaCorreta) {
                System.out.println("Senha Incorreta");

            }
        } while (senha != SenhaCorreta);

        System.out.println("Senha Correta");
        scanner.close();
    }
}