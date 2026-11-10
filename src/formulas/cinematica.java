package formulas;

public class cinematica {
    public static double velocidadeMedia(double distancia, double tempo) {
        if (tempo == 0) throw new IllegalArgumentException("O tempo nao pode ser zero.");
        return distancia / tempo;
    }

    public static double aceleracaoMedia(double variacaoVelocidade, double tempo) {
        if (tempo == 0) throw new IllegalArgumentException("O tempo nao pode ser zero.");
        return variacaoVelocidade / tempo;
    }

    public static double movimentoUniforme(double posicaoInicial, double velocidade, double tempo) {
        return posicaoInicial + velocidade * tempo;
    }

    public static double movimentoVariado(double velocidadeInicial, double aceleracao, double tempo) {
        return velocidadeInicial + aceleracao * tempo;
    }

    public static double torricelli(double velocidadeInicial, double aceleracao, double deslocamento) {
        double resultado = velocidadeInicial * velocidadeInicial + 2 * aceleracao * deslocamento;
        if (resultado < 0) throw new IllegalArgumentException("Os valores informados nao geram velocidade real.");
        return Math.sqrt(resultado);
    }
}
