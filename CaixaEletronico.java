import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        char opcao;

        do {
            System.out.println("Opcoes: ");
            System.out.println("(a) Consultar Saldo");
            System.out.println("(b) Saque");
            System.out.println("(c) Deposito");
            System.out.println("(d) Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.next().toLowerCase().charAt(0);

            switch (opcao) {
                case 'a' -> System.out.printf("Saldo Atual: R$ %.2f%n", saldo);
                case 'b' -> {
                    System.out.print("Digite o valor do saldo: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo Insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque Realizado!");
                    }
                }
                case 'c' -> {
                    System.out.print("Digite o valor do Deposito: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito Realizado.");
                }
                case 'd' -> System.out.println("Saindo...");
                default -> System.out.println("Opcao Invalida.");
            }
        } while (opcao != 'd');
        scanner.close();
    }
}