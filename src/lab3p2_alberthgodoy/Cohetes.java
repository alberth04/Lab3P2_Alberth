
package lab3p2_alberthgodoy;

import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class Cohetes {
    //atributos
    private double pesoSoportable;
    private String nombre;
    private int numSerie;
    private int potencia;
    private int velocidad;
    private ArrayList<Personas> personas = new ArrayList(); 
    
    //Constructor

    public Cohetes() {
    }

    public Cohetes(double pesoSoportable, String nombre, int numSerie, int potencia) {
        this.pesoSoportable = pesoSoportable;
        this.nombre = nombre;
        this.numSerie = numSerie;
        this.potencia = potencia;
    }
    

    //Getter y Setter

    public double getPesoSoportable() {
        return pesoSoportable;
    }

    public void setPesoSoportable(double pesoSoportable) {
        this.pesoSoportable = pesoSoportable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cohetes{" + "pesoSoportable=" + pesoSoportable + ", nombre=" + nombre + ", numSerie=" + numSerie + ", potencia=" + potencia + ", velocidad=" + velocidad + ", personas=" + personas;
    }
    
    
}
