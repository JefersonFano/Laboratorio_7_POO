/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeferson Fano
 */
public class Medico {

    private String nombre;
    private String cmp;
    private List<Especialidad> especialidades;

    public Medico(String nombre, String cmp, List<Especialidad> especialidadades) throws Exception {
        this.nombre = nombre;
        this.cmp = cmp;
        this.especialidades = especialidadades;
        if (especialidadades == null) {
            throw new Exception("No se puede crear");
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cmp
     */
    public String getCmp() {
        return cmp;
    }

    /**
     * @param cmp the cmp to set
     */
    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getDatosMostrar() {
        return this.nombre + " | CMP: " + this.cmp;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        this.especialidades.add(especialidad);
    }
}
