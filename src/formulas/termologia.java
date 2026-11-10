package formulas;

public class termologia {
    public static double calorSensivel(double massa, double calorEspecifico, double variacaoTemperatura) {
        return massa * calorEspecifico * variacaoTemperatura;
    }

    public static double calorLatente(double massa, double calorLatenteEspecifico) {
        return massa * calorLatenteEspecifico;
    }
}
