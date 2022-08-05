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
        int opcionMenu = 0;

        while (opcionMenu != 8) {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("===============MENU===============\n"
                    + "1.) crear Cohete\n"
                    + "2.) Crear Planeta\n"
                    + "3.) Editar Cohete\n"
                    + "4.) Editar Planeta\n"
                    + "5.) Listar Cohetes\n"
                    + "6.) Listar Planetes\n"
                    + "7.) Probar Cohete\n"
                    + "8.) Salir del Programa"));
            switch (opcionMenu) {
                case 1 -> {
                    int p = lista.size() - 1;
                    //Agregar un cohete
                    //Agregar el PesoSoportable
                    double pesoSoportable = Double.parseDouble(JOptionPane.showInputDialog("Peso soportable del cohete: "));
                    //validacion
                    while (pesoSoportable < 1) {
                        pesoSoportable = Double.parseDouble(JOptionPane.showInputDialog("Algos salio mal,\n"
                                + "Peso soportable del cohete: "));
                    }
                    //Agregar el nombreCohete
                    String nombreCohete = JOptionPane.showInputDialog("Ingrese el nombre del Cohete : ");
                    //Validacion
                    while (!nombreCohete.matches("[ a-zA-Z]+")) {
                        nombreCohete = JOptionPane.showInputDialog("Algo salio mal,\n"
                                + "Ingrese el nombre del planeta : ");
                    }

                    //Agregar la serie
                    int serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la serie del planeta: "));
                    //Validacion
                    boolean validacion = false;
                    if (lista.isEmpty()) {
                        validacion = true;
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            //validacion
                            if (lista.get(i) instanceof Cohetes && ((Cohetes) lista.get(i)).getNumSerie() == serieCohete) {
                                validacion = true;
                            }
                        }

                        while (validacion == false) {
                            serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\nIngrese la serie del planeta: "));

                            for (int i = 0; i < lista.size(); i++) {
                                //validacion
                                if (lista.get(i) instanceof Cohetes && ((Cohetes) lista.get(i)).getNumSerie() == serieCohete) {
                                    validacion = true;
                                }
                            }
                        }
                    }

                    //Agregar potencia
                    int potenciaCohetes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia del cohete [1-9] "));
                    //validacion
                    while (potenciaCohetes < 1 || potenciaCohetes > 9) {
                        potenciaCohetes = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\n"
                                + "Ingrese la potencia del cohete [1-9] "));
                    }

                    //Agregar el tipo de Cohete
                    int tipoCohete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de cohete: \n"
                            + "1.) Liquidos\n"
                            + "2.) DeFases\n"
                            + "3.) Solido\n"));
                    switch (tipoCohete) {
                        case 1 -> {

                            int pos = lista.size() - 1;
                            double litroGasolina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los litros de gasolina: "));
                            //validacion
                            while (litroGasolina < 0.0) {
                                litroGasolina = Double.parseDouble(JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + "Ingrese los litros de gasolina: "));
                            }
                            lista.add(new Combustible_Liquido(litroGasolina, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }
                        case 2 -> {

                            int pos = lista.size() - 1;
                            //Agregar cantFases
                            int cantFases = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de fases: "));
                            while (cantFases < 1) {
                                cantFases = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal\n"
                                        + "Ingrese la cantidad de fases: "));
                            }

                            //Agregar cant Motores
                            int cantMotores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de motores: "));
                            while (cantMotores < 1) {
                                cantMotores = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + "Ingrese la cantidad de motores: "));
                            }

                            //agregar altura 
                            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura "));
                            while (altura < 0.0) {
                                altura = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + "Ingrese la altura "));
                            }
                            lista.add(new DeFases(cantFases, cantMotores, altura, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }
                        case 3 -> {

                            int pos = lista.size() - 1;
                            //Agregar kilos combustibles
                            double kilosCombu = Double.parseDouble(JOptionPane.showInputDialog("ccantidad de kilos combustible"));
                            while (kilosCombu < 0.0) {
                                kilosCombu = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + " Ingrese los kilos de combustible: "));
                            }

                            //Agregar nombrematerial
                            String material = JOptionPane.showInputDialog("Ingrese el nombre del material: ");
                            while (!material.matches("[ a-zA-Z]+")) {
                                material = JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + "Ingrese el nombre del material: ");
                            }
                            lista.add(new Combustible_Solido(kilosCombu, material, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }

                        default ->
                            JOptionPane.showMessageDialog(null, "No existe esa opcion");

                    }
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    //Listar Cohetes
                    for (Object object : lista) {
                        if (object instanceof Cohetes) {
                            String message = String.format("%d %s%n", lista.indexOf(object),object);
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }
                    
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

}
