package util;

import java.util.Scanner;

public class input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) return scanner.nextInt();
            System.out.println("Entrada invalida. Digite um numero inteiro.");
            scanner.next();
        }
    }

    public static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) return scanner.nextDouble();
            System.out.println("Entrada invalida. Digite um numero (use ponto ou virgula conforme seu terminal).");
            scanner.next();
        }
    }

    public static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
}
