
package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Gaseosos extends Planetas{
    //Atributos
    private double presion;
    private int cantanillos;
    
    //Constructorr

    public Gaseosos(double presion, int cantanillos, String nombrePlaneta, double masa, double radio, double temperaturaProm) {
        super(nombrePlaneta, masa, radio, temperaturaProm);
        this.presion = presion;
        this.cantanillos = cantanillos;
    }

    
    
    
    //Getter y Setter

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public int getCantanillos() {
        return cantanillos;
    }

    public void setCantanillos(int cantanillos) {
        this.cantanillos = cantanillos;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString()+ "Gaseosos{" + "presion=" + presion + ", cantanillos=" + cantanillos + '}';
    }
    
    
}
