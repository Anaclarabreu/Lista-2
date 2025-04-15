import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jair = 0, carlos = 0, neves = 0, nulo = 0, branco = 0, voto;

        do {
            System.out.println("As opcoes sao: ");
            System.out.println("1. Candidato Jair Rodrigues");
            System.out.println("2. Candidato Carlos Luz");
            System.out.println("3. Candidato Neves Rocha");
            System.out.println("4. Nulo");
            System.out.println("5. Branco");
            System.out.println("6. Encerrar votacao");
            System.out.print("Entre com o seu voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1 -> jair++;
                case 2 -> carlos++;
                case 3 -> neves++;
                case 4 -> nulo++;
                case 5 -> branco++;
                case 6 -> System.out.println("Encerrando a votacao...");
                default -> System.out.println("Voto Invalido.");
            }
        } while (voto != 6);

        int totalVotos = jair + carlos + neves + nulo + branco;
        System.out.println("Resultado da votacao: ");
        System.out.println("Jair Rodrigues: + jair");
        System.out.println("Carlos Luz: + carlos");
        System.out.println("Neves Rocha: + neves");
        System.out.printf("%% Nulos: %2f%%\n,(nulo * 100.0) / totalVotos");
        System.out.printf("%% Brancos: %2f%%\n,(branco * 100.0) / totalVotos");

        if (jair > carlos && jair > neves)
            System.out.println("Vencedor Jair Rodrigues");
        else if (carlos > jair && carlos > neves)
            System.out.println("Vencedor Carlos Luz");
        else if (neves > jair && neves > carlos)
            System.out.println("Vencedor Neves Rocha");
        else
            System.out.println("Empate entre candidatos. ");

        scanner.close();
    }
}
