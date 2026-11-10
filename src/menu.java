
import java.util.Scanner;

public class menu {

    Scanner scanner = new Scanner(System.in);
    int opt;

    public void iniciar() {

        do {
            System.out.println("\nCALCULADORA FISICA");
            System.out.println("1 - Cinematica");
            System.out.println("2 - Dinamica");
            System.out.println("3 - Energia");
            System.out.println("4 - Termologia");
            System.out.println("5 - Eletricidade");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    menuCinematica();
                    break;

                case 2:
                    System.out.println("Voce escolheu Dinamica");
                    break;

                case 3:
                    System.out.println("Voce escolheu Energia");
                    break;

                case 4:
                    System.out.println("Voce escolheu Termologia");
                    break;

                case 5:
                    System.out.println("Voce escolheu Eletricidade");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opt != 0);
    }

    public void menuCinematica() {

        int optCine;

        do {
            System.out.println("\nCINEMATICA");
            System.out.println("1 - Velocidade media");
            System.out.println("2 - Aceleracao media");
            System.out.println("3 - Movimento uniforme");
            System.out.println("4 - Movimento uniformemente variado");
            System.out.println("5 - Equacao de Torricelli");
            System.out.println("6 - Posicao no movimento uniforme");
            System.out.println("7 - Deslocamento");
            System.out.println("8 - Tempo");
            System.out.println("0 - Voltar");

            System.out.print("Escolha uma opcao: ");

            optCine = scanner.nextInt();

            switch (optCine) {

                case 1:
                    System.out.println("Voce escolheu Velocidade media");
                    break;

                case 2:
                    System.out.println("Voce escolheu Aceleracao media");
                    break;

                case 3:
                    System.out.println("Voce escolheu Movimento uniforme");
                    break;

                case 4:
                    System.out.println("Voce escolheu Movimento uniformemente variado");
                    break;

                case 5:
                    System.out.println("Voce escolheu Equacao de Torricelli");
                    break;

                case 6:
                    System.out.println("Voce escolheu Posicao no movimento uniforme");
                    break;

                case 7:
                    System.out.println("Voce escolheu Deslocamento");
                    break;

                case 8:
                    System.out.println("Voce escolheu Tempo");
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (optCine != 0);
    }
}
