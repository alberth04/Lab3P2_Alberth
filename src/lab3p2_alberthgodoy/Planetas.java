package lab3p2_alberthgodoy;

import java.util.ArrayList;

/**
 *
 * @author godoy
 * 
 */
public class Planetas {
    //Atributos
    private String nombrePlaneta;
    private double masa;
    private double radio;
    private double temperaturaProm;
    private double velocEscape;
    private ArrayList<Lunas> lunas = new ArrayList();
    

    //Constructor
    public Planetas() {
        
    }

    public Planetas(String nombrePlaneta, double masa, double radio, double temperaturaProm) {
        this.nombrePlaneta = nombrePlaneta;
        this.masa = masa;
        this.radio = radio;
        this.temperaturaProm = temperaturaProm;
        
    }
    
    

    //Getter y Setter
    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getTemperaturaProm() {
        return temperaturaProm;
    }

    public void setTemperaturaProm(double temperaturaProm) {
        this.temperaturaProm = temperaturaProm;
    }

    public double getVelocEscape() {
        return velocEscape;
    }

    public void setVelocEscape(double velocEscape) {
        this.velocEscape = velocEscape;
    }

    public ArrayList<Lunas> getLunas() {
        return lunas;
    }

    public void setLunas(ArrayList<Lunas> lunas) {
        this.lunas = lunas;
    }

    //toString
    @Override
    public String toString() {
        return "Planetas= " + "nombrePlaneta=" + nombrePlaneta + ", masa=" + masa + ", radio=" + radio + ", temperaturaProm=" + temperaturaProm + ", velocEscape=" + velocEscape + ", lunas=" + lunas + '}';
    }
    
    //metodo para la velocidad de escape
    public double calcuVelocidadEscape(double M, double r){
        double respuesta;
        double G = 6.67 * Math.pow(10, -11);
        return respuesta = Math.sqrt((2 * G * M) / r);
    }
    
    

}
