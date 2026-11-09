package formulas;

public class cinematica{
    public double velocidademedia(double distancia, double tempo){
        
        if(tempo <= 0){
            return -1;
        }

        return distancia/tempo; 
    }
}