
package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Combustible_Liquido extends Cohetes{
    //Atributos
    private double litrosGasolina;
    
    //Constructor

    public Combustible_Liquido() {
        super();
    }

    public Combustible_Liquido(double litrosGasolina, double pesoSoportable, String nombre, int numSerie, int potencia) {
        super(pesoSoportable, nombre, numSerie, potencia);
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
        return super.toString()+ "Combustible_Liquido{" + "litrosGasolina=" + litrosGasolina + '}';
    }
    
}
