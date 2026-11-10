package util;

import formulas.*;

public class Menu {
    public void iniciar() {
        int opcao;
        do {
            System.out.println("\n========== CALCULADORA DE FISICA ==========");
            System.out.println("1 - Cinematica");
            System.out.println("2 - Dinamica");
            System.out.println("3 - Trabalho e Energia");
            System.out.println("4 - Termologia");
            System.out.println("5 - Eletricidade");
            System.out.println("0 - Sair");
            opcao = input.lerInteiro("Escolha uma opcao: ");

            switch (opcao) {
                case 1: menuCinematica(); break;
                case 2: menuDinamica(); break;
                case 3: menuEnergia(); break;
                case 4: menuTermologia(); break;
                case 5: menuEletricidade(); break;
                case 0: System.out.println("Calculadora encerrada."); break;
                default: System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    private void menuCinematica() {
        int op;
        do {
            cabecalho("CINEMATICA");
            System.out.println("1 - Velocidade media (v = delta s / delta t)");
            System.out.println("2 - Aceleracao media (a = delta v / delta t)");
            System.out.println("3 - Movimento uniforme (s = s0 + v.t)");
            System.out.println("4 - Movimento variado (v = v0 + a.t)");
            System.out.println("5 - Equacao de Torricelli (v^2 = v0^2 + 2.a.delta s)");
            System.out.println("0 - Voltar");
            op = input.lerInteiro("Opcao: ");
            try {
                switch (op) {
                    case 1:
                        resultado("Velocidade media", cinematica.velocidadeMedia(
                            ler("Deslocamento (m): "), ler("Tempo (s): ")), "m/s"); break;
                    case 2:
                        resultado("Aceleracao media", cinematica.aceleracaoMedia(
                            ler("Variacao da velocidade (m/s): "), ler("Tempo (s): ")), "m/s^2"); break;
                    case 3:
                        resultado("Posicao final", cinematica.movimentoUniforme(
                            ler("Posicao inicial (m): "), ler("Velocidade (m/s): "), ler("Tempo (s): ")), "m"); break;
                    case 4:
                        resultado("Velocidade final", cinematica.movimentoVariado(
                            ler("Velocidade inicial (m/s): "), ler("Aceleracao (m/s^2): "), ler("Tempo (s): ")), "m/s"); break;
                    case 5:
                        resultado("Modulo da velocidade final", cinematica.torricelli(
                            ler("Velocidade inicial (m/s): "), ler("Aceleracao (m/s^2): "), ler("Deslocamento (m): ")), "m/s"); break;
                    case 0: break;
                    default: System.out.println("Opcao invalida.");
                }
            } catch (IllegalArgumentException e) { System.out.println("Nao foi possivel calcular: " + e.getMessage()); }
        } while (op != 0);
    }

    private void menuDinamica() {
        int op;
        do {
            cabecalho("DINAMICA");
            System.out.println("1 - Segunda Lei de Newton (F = m.a)");
            System.out.println("2 - Forca peso (P = m.g)");
            System.out.println("3 - Forca de atrito (Fat = coeficiente.N)");
            System.out.println("0 - Voltar");
            op = input.lerInteiro("Opcao: ");
            switch (op) {
                case 1: resultado("Forca resultante", dinamica.segundaLeiNewton(ler("Massa (kg): "), ler("Aceleracao (m/s^2): ")), "N"); break;
                case 2: resultado("Forca peso", dinamica.forcaPeso(ler("Massa (kg): "), ler("Gravidade (m/s^2, use 9.8): ")), "N"); break;
                case 3: resultado("Forca de atrito", dinamica.forcaAtrito(ler("Coeficiente de atrito: "), ler("Forca normal (N): ")), "N"); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private void menuEnergia() {
        int op;
        do {
            cabecalho("TRABALHO E ENERGIA");
            System.out.println("1 - Trabalho de uma forca (W = F.d.cos(angulo))");
            System.out.println("2 - Energia cinetica (Ec = m.v^2/2)");
            System.out.println("3 - Energia potencial gravitacional (Ep = m.g.h)");
            System.out.println("0 - Voltar");
            op = input.lerInteiro("Opcao: ");
            switch (op) {
                case 1: resultado("Trabalho", energia.trabalho(ler("Forca (N): "), ler("Deslocamento (m): "), ler("Angulo entre forca e deslocamento (graus): ")), "J"); break;
                case 2: resultado("Energia cinetica", energia.energiaCinetica(ler("Massa (kg): "), ler("Velocidade (m/s): ")), "J"); break;
                case 3: resultado("Energia potencial gravitacional", energia.energiaPotencial(ler("Massa (kg): "), ler("Gravidade (m/s^2, use 9.8): "), ler("Altura (m): ")), "J"); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private void menuTermologia() {
        int op;
        do {
            cabecalho("TERMOLOGIA");
            System.out.println("1 - Calor sensivel (Q = m.c.delta T)");
            System.out.println("2 - Calor latente (Q = m.L)");
            System.out.println("0 - Voltar");
            op = input.lerInteiro("Opcao: ");
            switch (op) {
                case 1: resultado("Calor sensivel", termologia.calorSensivel(ler("Massa (kg): "), ler("Calor especifico (J/kg.C): "), ler("Variacao de temperatura (C): ")), "J"); break;
                case 2: resultado("Calor latente", termologia.calorLatente(ler("Massa (kg): "), ler("Calor latente especifico (J/kg): ")), "J"); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private void menuEletricidade() {
        int op;
        do {
            cabecalho("ELETRICIDADE");
            System.out.println("1 - Primeira Lei de Ohm (U = R.i)");
            System.out.println("2 - Potencia eletrica (P = U.i)");
            System.out.println("0 - Voltar");
            op = input.lerInteiro("Opcao: ");
            switch (op) {
                case 1: resultado("Tensao eletrica", eletricidade.leiOhm(ler("Resistencia (ohm): "), ler("Corrente (A): ")), "V"); break;
                case 2: resultado("Potencia eletrica", eletricidade.potenciaEletrica(ler("Tensao (V): "), ler("Corrente (A): ")), "W"); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private double ler(String mensagem) { return input.lerDouble(mensagem); }
    private void resultado(String nome, double valor, String unidade) {
        System.out.printf("%s: %.4f %s%n", nome, valor, unidade);
    }
    private void cabecalho(String nome) {
        System.out.println("\n---------- " + nome + " ----------");
    }
}
