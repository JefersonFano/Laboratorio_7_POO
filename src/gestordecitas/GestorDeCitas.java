/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameGestorDeCitas;

/**
 *
 * @author Jeferson Fano
 */
public class GestorDeCitas {

    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    
    public static List<String> horasDisponibles = new ArrayList<>();
    public static List<String> fechasDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Genero las listas en blanco para todo el sistema hasta que se cierre
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        
        horasDisponibles.add("9:00 am");
        horasDisponibles.add("9:30 am");
        horasDisponibles.add("10:00 am");
        horasDisponibles.add("10:30 am");
        horasDisponibles.add("11:00 am");
        horasDisponibles.add("11:30 am");
        horasDisponibles.add("12:00 am");
        horasDisponibles.add("12:30 am");

        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        fechasDisponibles.add("10/05/2023");


        //Inicia la ventana principal
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null);//Centra el formulario
        framePrincipal.setVisible(true);
    }

}
