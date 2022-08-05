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
        ArrayList cohetes = new ArrayList();
        ArrayList planetas = new ArrayList();
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
                                + "Ingrese el nombre del cohete : ");
                    }

                    //Agregar la serie
                    int serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la serie del planeta: "));
                    //Validacion
                    boolean validacion = false;
                    if (cohetes.isEmpty()) {

                    } else {
                        for (int i = 0; i < cohetes.size(); i++) {
                            //validacion
                            if (cohetes.get(i) instanceof Cohetes && ((Cohetes) cohetes.get(i)).getNumSerie() == serieCohete) {
                                validacion = true;
                            }
                        }

                        while (validacion == true) {
                            serieCohete = Integer.parseInt(JOptionPane.showInputDialog("Algo salio mal,\nIngrese la serie del planeta: "));

                            for (int i = 0; i < cohetes.size(); i++) {
                                //validacion
                                if (cohetes.get(i) instanceof Cohetes && ((Cohetes) cohetes.get(i)).getNumSerie() == serieCohete) {
                                    validacion = false;
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

                            int pos = cohetes.size() - 1;
                            double litroGasolina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los litros de gasolina: "));
                            //validacion
                            while (litroGasolina < 0.0) {
                                litroGasolina = Double.parseDouble(JOptionPane.showInputDialog("Algo salio mal,\n"
                                        + "Ingrese los litros de gasolina: "));
                            }
                            cohetes.add(new Combustible_Liquido(litroGasolina, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }
                        case 2 -> {

                            int pos = cohetes.size() - 1;
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
                            cohetes.add(new DeFases(cantFases, cantMotores, altura, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }
                        case 3 -> {

                            int pos = cohetes.size() - 1;
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
                            cohetes.add(new Combustible_Solido(kilosCombu, material, pesoSoportable, nombreCohete, serieCohete, potenciaCohetes));
                        }

                        default ->
                            JOptionPane.showMessageDialog(null, "No existe esa opcion");

                    }
                }
                case 2 -> {
                    //Agregar Planetas
                    //Agregar nombre;
                    String nombrePlaneta = JOptionPane.showInputDialog("Ingrese el nombre del planeta: ");
                    //validacion
                    boolean validacion = false;
                    if (planetas.isEmpty()) {

                    } else {
                        for (int i = 0; i < planetas.size(); i++) {
                            //validacion
                            if (planetas.get(i) instanceof Planetas && ((Planetas) planetas.get(i)).getNombrePlaneta().equalsIgnoreCase(nombrePlaneta)) {
                                validacion = true;
                            }
                        }

                        while (validacion == true) {
                            nombrePlaneta = JOptionPane.showInputDialog("Algo salio mal,\nIngrese la serie del planeta: ");

                            for (int i = 0; i < planetas.size(); i++) {
                                //validacion
                                if (planetas.get(i) instanceof Planetas && ((Planetas) planetas.get(i)).getNombrePlaneta().equalsIgnoreCase(nombrePlaneta)) {
                                    validacion = true;
                                }
                            }
                        }
                    }
                    while (!nombrePlaneta.matches("[ a-zA-Z]+")) {
                        nombrePlaneta = JOptionPane.showInputDialog("Algo salio mal,\n"
                                + "Ingrese el nombre del planeta: ");
                    }

                    //Ingrese la masa
                    double masaPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa del planeta: "));
                    while (masaPlaneta < 0.0) {
                        masaPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa del planeta: "));
                    }
                    //Radio del planeta
                    double radioPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del planeta: "));
                    while (radioPlaneta < 0.0) {
                        radioPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del planeta: "));
                    }

                    //agregar temperaturaprom planeta
                    double temperaturaPromPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura: "));
                    while (temperaturaPromPlaneta < 0.0) {
                        temperaturaPromPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura: "));
                    }

                    //Tipo de Planeta 
                    int tipoPlaneta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de planeta:\n"
                            + "1.) Rocosos\n"
                            + "2.) Gaseosos\n"));
                    switch (tipoPlaneta) {
                        case 1 -> {
                            //Rocosos
                            //Densidad
                            double densidadPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la densidad : "));
                            while (densidadPlaneta < 0) {
                                densidadPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la densidad : "));
                            }
                            //vida 
                            char vidaL = JOptionPane.showInputDialog("Ingrese si existe vida util o no[s o n]: ").charAt(0);
                            while (vidaL != 's' && vidaL != 'S' && vidaL != 'n' && vidaL != 'N') {
                                vidaL = JOptionPane.showInputDialog("Ingrese si existe vida util o no[s o n]: ").charAt(0);
                            }
                            boolean validar = false;
                            if (vidaL == 's' || vidaL == 'S') {
                                validar = true;
                            } else {

                            }
                            planetas.add(new Rocosos(densidadPlaneta, validar, nombrePlaneta, masaPlaneta, radioPlaneta, temperaturaPromPlaneta));
                        }
                        case 2 -> {
                            //Gaseoso
                            //Agregar presion
                            double presionPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la densidad del planeta : "));
                            while (presionPlaneta < 0) {
                                presionPlaneta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la densidad del planeta : "));
                            }
                            //Agregar cantidad anillos
                            int cantAnillos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de anillos del planeta: "));
                            while (cantAnillos < 0) {
                                cantAnillos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de anillos del planeta: "));
                            }
                            planetas.add(new Gaseosos(presionPlaneta, cantAnillos, nombrePlaneta, masaPlaneta, radioPlaneta, temperaturaPromPlaneta));
                        }
                        default ->
                            JOptionPane.showMessageDialog(null, "No existe la opcion");
                    }//fin switch

                    //Velocidad de escape 
                    int p = planetas.size() - 1;
                    double velocidadEscape = ((Planetas) planetas.get(p)).calcuVelocidadEscape(masaPlaneta, radioPlaneta);
                    ((Planetas) planetas.get(p)).setVelocEscape(velocidadEscape);

                    //Agregar las Lunas
                }
                case 3 -> {
                    //Editar Cohete
                    int posCohete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del cohete que desea editar: "));
                    if (posCohete < cohetes.size()) {
                        int editarCohete = Integer.parseInt(JOptionPane.showInputDialog("Que desea editar del cohete: \n"
                                + "1.) Agregar Persona\n"
                                + "2.) Eliminar Persona\n"
                                + "3.) Listar Personas"));
                        switch (editarCohete) {
                            case 1 -> {
                                int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas a agregar al cohete: "));
                                for (int i = 0; i < cantPersonas; i++) {
                                    ((Cohetes) cohetes.get(posCohete)).getPersonas().add(new Personas());
                                    String nombrePersona = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                                    while (!nombrePersona.matches("[ a-zA-Z]+")) {
                                        nombrePersona = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                                    }
                                    ((Cohetes) cohetes.get(posCohete)).getPersonas().get(i).setNombre(nombrePersona);
                                    //agregar edad
                                    int edadPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                                    while (edadPersona < 0) {
                                        edadPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                                    }
                                    ((Cohetes) cohetes.get(posCohete)).getPersonas().get(i).setEdad(edadPersona);
                                    //agregar peso
                                    double pesoPersona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona: "));
                                    while (pesoPersona < 0.0) {
                                        pesoPersona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona: "));
                                    }
                                    ((Cohetes) cohetes.get(posCohete)).getPersonas().get(i).setPeso(pesoPersona);

                                }
                            }
                            case 2 -> {
                                int posPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la persona a eliminar"));
                                if (posPersona < ((Cohetes) cohetes.get(posCohete)).getPersonas().size()) {
                                    ((Cohetes) cohetes.get(posCohete)).getPersonas().remove(posPersona);
                                    JOptionPane.showMessageDialog(null, "Persona eliminada");
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existe la opcion");
                                }
                            }
                            case 3 -> {
                                for (Personas cohete : ((Cohetes) cohetes.get(posCohete)).getPersonas()) {
                                    String message = String.format("[%d] %s%n", ((Cohetes) cohetes.get(posCohete)).getPersonas().indexOf(cohete), cohetes);
                                    JOptionPane.showMessageDialog(null, message);
                                }
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "No existe la opcion");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ese cohete");

                    }

                }
                case 4 -> {
                    //Editar Planeta
                    int posPlaneta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del planeta a agregar Lunas: "));
                    if (posPlaneta < planetas.size()) {
                        int editarPlaneta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que desea hacer: \n"
                                + "1.) Agregar Luna\n"
                                + "2.) Eliminar Luna\n"
                                + "3.) Listar Lunas\n"));
                        switch (editarPlaneta) {
                            case 1 -> {
                                //Agregar Luna
                                int numLunas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lunes a agregar : "));
                                for (int i = 0; i < numLunas; i++) {
                                    ((Planetas) planetas.get(posPlaneta)).getLunas().add(new Lunas());
                                    String nombreLuna = JOptionPane.showInputDialog("Ingrese el nombre de la luna: ");
                                    while (!nombreLuna.matches("[ a-zA-z]+")) {
                                        nombreLuna = JOptionPane.showInputDialog("Ingrese el nombre de la luna: ");

                                    }
                                    ((Planetas) planetas.get(posPlaneta)).getLunas().get(i).setNombre(nombreLuna);
                                    int numCrateres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de crateres de la luna: "));
                                    while (numCrateres < 0) {
                                        numCrateres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de crateres de la luna: "));
                                    }
                                     ((Planetas) planetas.get(posPlaneta)).getLunas().get(i).setCantCrateres(numCrateres);
                                }
                            }
                            case 2 -> {
                                int posLuna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de luna a eliminar"));
                                if (posLuna <  ((Planetas) planetas.get(posPlaneta)).getLunas().size()) {
                                    ((Planetas) planetas.get(posPlaneta)).getLunas().remove(posLuna);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existe esa Luna");
                                }
                            }
                            case 3 -> {
                                for (Lunas luna : ((Planetas) planetas.get(posPlaneta)).getLunas()) {
                                    String message = String.format("[%d] %s%n", ((Planetas) planetas.get(posPlaneta)).getLunas().indexOf(luna), luna);
                                }
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "No existe esa opcion");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ese planeta");
                    }
                }
                case 5 -> {
                    //Listar Cohetes
                    for (Object object : cohetes) {
                        if (object instanceof Cohetes) {
                            String message = String.format("[%d] %s%n", cohetes.indexOf(object), object);
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }

                }
                case 6 -> {
                    //Listar Planetas
                    for (Object object : planetas) {
                        if (object instanceof Planetas) {
                            String message = String.format("[%d] %s%n", planetas.indexOf(object), object);
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }
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
