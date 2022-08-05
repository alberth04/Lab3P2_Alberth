/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Combustible_Solido extends Cohetes{
    //atributos
    private double kilosCombu;
    private String nombreMaterial;
    
    //Constructor

    public Combustible_Solido() {
        
    }
    
    //Getter y Setter

    public double getKilosCombu() {
        return kilosCombu;
    }

    public void setKilosCombu(double kilosCombu) {
        this.kilosCombu = kilosCombu;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    
    //toString

    @Override
    public String toString() {
        return "Combustible_Solido{" + "kilosCombu=" + kilosCombu + ", nombreMaterial=" + nombreMaterial + '}';
    }
    
}
