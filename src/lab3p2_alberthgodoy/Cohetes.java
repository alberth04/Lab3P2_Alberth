
package lab3p2_alberthgodoy;

import java.util.ArrayList;
import java.util.Random;

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
    private double velocidad;
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

    public Cohetes(double pesoSoportable, String nombre, int numSerie, int potencia, double velocidad) {
        this.pesoSoportable = pesoSoportable;
        this.nombre = nombre;
        this.numSerie = numSerie;
        this.potencia = potencia;
        this.velocidad = velocidad;
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

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
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
    
    //Calcular velocidad
    public double calcularVelocidadCohete(){
        Random rnd = new Random();
        int numrandom = rnd.nextInt(20000-5000+1)+5000;
        System.out.println(numrandom);
        return velocidad = numrandom * potencia;
    }
    
    
}
