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
public class DeFases extends Cohetes{
    //atributos
    private int cantFases;
    private int cantMotores;
    private double altura;
    
    //Constructor

    public DeFases() {
        
    }

    public DeFases(int cantFases, int cantMotores, double altura, double pesoSoportable, String nombre, int numSerie, int potencia) {
        super(pesoSoportable, nombre, numSerie, potencia);
        this.cantFases = cantFases;
        this.cantMotores = cantMotores;
        this.altura = altura;
    }

    public DeFases(int cantFases, int cantMotores, double altura, double pesoSoportable, String nombre, int numSerie, int potencia, double velocidad) {
        super(pesoSoportable, nombre, numSerie, potencia, velocidad);
        this.cantFases = cantFases;
        this.cantMotores = cantMotores;
        this.altura = altura;
    }
    
    
    //Getter y Setter

    public int getCantFases() {
        return cantFases;
    }

    public void setCantFases(int cantFases) {
        this.cantFases = cantFases;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +"DeFases{" + "cantFases=" + cantFases + ", cantMotores=" + cantMotores + ", altura=" + altura + '}';
    }
    
}
