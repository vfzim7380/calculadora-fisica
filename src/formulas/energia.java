package formulas;

public class energia {
    public static double trabalho(double forca, double deslocamento, double anguloGraus) {
        return forca * deslocamento * Math.cos(Math.toRadians(anguloGraus));
    }

    public static double energiaCinetica(double massa, double velocidade) {
        return massa * velocidade * velocidade / 2;
    }

    public static double energiaPotencial(double massa, double gravidade, double altura) {
        return massa * gravidade * altura;
    }
}
