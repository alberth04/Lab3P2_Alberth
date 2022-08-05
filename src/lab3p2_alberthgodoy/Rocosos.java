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

    public Rocosos(double densidad, boolean vidaL) {
        super();
        this.densidad = densidad;
        this.vidaL = vidaL;
    }
    
    //to String

    @Override
    public String toString() {
        return "Rocosos{" + "densidad=" + densidad + ", vidaL=" + vidaL + '}';
    }
    
    
}
