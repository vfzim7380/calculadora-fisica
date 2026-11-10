package formulas;

public class eletricidade {
    public static double leiOhm(double resistencia, double corrente) {
        return resistencia * corrente;
    }

    public static double potenciaEletrica(double tensao, double corrente) {
        return tensao * corrente;
    }
}
