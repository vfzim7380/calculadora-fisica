import java.util.Scanner;

public class menu{
    Scanner scanner = new Scanner(System.in);
    int opt;

    public void iniciar(){
    
        do{
            System.out.println("CALCULADORA FISICA");
            System.out.println("1 - Cinematica");
            System.out.println("2 - Dinamica");
            System.out.println("3 - Energia");
            System.out.println("4 - Termologia");
            System.out.println("5 - Eletricidade");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");

            opt = scanner.nextInt();

            switch (opt){
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
        } while(opt != 0);
    }

    public void menuCinematica(){
        do{
            System.out.println("CINEMATICA");
            System.out.println("1 - formula");
            System.out.println("2 - formula");
            System.out.println("3 - formula");
            System.out.println("4 - formula");
            System.out.println("5 - formula");
            System.out.println("6 - formula");
            System.out.println("7 - formula");
            System.out.println("8 - formula");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");

            int optCine = scanner.nextInt();

            switch(optCine){
                case 1:
                    formula1();
                    break;

                case 3:
                    formula1();
                    break;

                case 4:
                    formula1();
                    break;

                case 5:
                    formula1();
                    break;

                case 6:
                    formula1();
                    break;

                case 7:
                    formula1();
                    break;

                case 8:
                    formula1();
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