package lab3p2_alberthgodoy;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author godoy
 */
public class Lab3P2_AlberthGodoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        //Creando el Menu

        int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("===============MENU===============\n"
                + "1.) Cohete\n"
                + "2.) Crear Planeta\n"
                + "3.) Editar Cohete\n"
                + "4.) Editar Planeta\n"
                + "5.) Listar Cohetes\n"
                + "6.) Listar Planetes\n"
                + "7.) Probar Cohete\n"
                + "8.) Salir del Programa"));
        switch (opcionMenu) {
            case 1 -> {
                lista.add(new Cohetes());
                int p = lista.size() - 1;
                //Agregar un cohete
                //Agregar el PesoSoportable
                double pesoSoportable = Double.parseDouble(JOptionPane.showInputDialog("Peso soportable del cohete: "));
                //validacion
                while (pesoSoportable < 1) {
                    pesoSoportable = Double.parseDouble(JOptionPane.showInputDialog("Algos salio mal,\n"
                            + "Peso soportable del cohete: "));
                }
                ((Cohetes) lista.get(p)).setPesoSoportable(pesoSoportable);
                //Agregar el nombreCohete
                String nombreCohete = JOptionPane.showInputDialog("Ingrese el nombre del planeta : ");
                //Validacion
                while (nombreCohete.matches("[ a-zA-Z]+")) {
                    nombreCohete = JOptionPane.showInputDialog("Algo salio mal,\n"
                            + "Ingrese el nombre del planeta : ");
                }
                ((Cohetes) lista.get(p)).setNombre(nombreCohete);
                //Agregar la serie
                int serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la serie del planeta: "));
                //Validacion
                boolean validacion = false;

                for (int i = 0; i < lista.size(); i++) {
                    //validacion
                    if (lista.get(i) instanceof Cohetes && ((Cohetes) lista.get(p)).getNumSerie() == serieCohete) {
                        validacion = true;
                    }
                }
                
                while (validacion == false) {
                    serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\nIngrese la serie del planeta: "));

                    for (int i = 0; i < lista.size(); i++) {
                        //validacion
                        if (lista.get(i) instanceof Cohetes && ((Cohetes) lista.get(p)).getNumSerie() == serieCohete) {
                            validacion = true;
                        }
                    }
                }
                
                //Agregar potencia
                int potenciaCohetes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia del cohete "))

            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            case 7 -> {
            }
            case 8 -> {
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            }
            default ->
                JOptionPane.showMessageDialog(null, "No existe esa opcion");
        }

    }

}
