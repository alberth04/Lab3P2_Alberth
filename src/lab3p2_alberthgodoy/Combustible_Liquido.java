
package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Combustible_Liquido extends Cohetes{
    //Atributos
    private double litrosGasolina;
    
    //Constructor

    public Combustible_Liquido(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }
    
    //Getter y Setter

    public double getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }
    
    //toString

    @Override
    public String toString() {
        return "Combustible_Liquido{" + "litrosGasolina=" + litrosGasolina + '}';
    }
    
}
