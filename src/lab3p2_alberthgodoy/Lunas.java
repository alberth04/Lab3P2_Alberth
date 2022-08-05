
package lab3p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Lunas {
    //atributos
    private String nombre;
    private int cantCrateres;
    
    //Constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCrateres() {
        return cantCrateres;
    }

    public void setCantCrateres(int cantCrateres) {
        this.cantCrateres = cantCrateres;
    }
    
    //toString

    @Override
    public String toString() {
        return "Lunas=" + "nombre=" + nombre + ", cantCrateres=" + cantCrateres;
    }
    
}
