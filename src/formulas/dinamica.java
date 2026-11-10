package formulas;

public class dinamica {
    public static double segundaLeiNewton(double massa, double aceleracao) {
        return massa * aceleracao;
    }

    public static double forcaPeso(double massa, double gravidade) {
        return massa * gravidade;
    }

    public static double forcaAtrito(double coeficiente, double normal) {
        return coeficiente * normal;
    }
}
