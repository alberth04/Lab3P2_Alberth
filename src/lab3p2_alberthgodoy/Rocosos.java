package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Rocosos extends Planetas{
    //Atributos
    public double densidad;
    public boolean vidaL;
    
    //Constructor

    public Rocosos(double densidad, boolean vidaL, String nombrePlaneta, double masa, double radio, double temperaturaProm) {
        super(nombrePlaneta, masa, radio, temperaturaProm);
        this.densidad = densidad;
        this.vidaL = vidaL;
    }

    public Rocosos(double densidad, boolean vidaL, String nombrePlaneta, double masa, double radio, double temperaturaProm, double velocEscape) {
        super(nombrePlaneta, masa, radio, temperaturaProm, velocEscape);
        this.densidad = densidad;
        this.vidaL = vidaL;
    }

    
    
    //to String

    @Override
    public String toString() {
        return super.toString() + "Rocosos{" + "densidad=" + densidad + ", vidaL=" + vidaL + '}';
    }
    
    
}
