/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Grupo 5
 */
public class Paciente extends Persona {
    
    protected String email;
    protected List<Receta> recetas;
    protected HistoriaClinica historiaClinica;
    protected Cita cita;

    public Paciente(String email, List<Receta> recetas, HistoriaClinica historiaClinica, Cita cita, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.email = email;
        this.recetas = recetas;
        this.historiaClinica = historiaClinica;
        this.cita = cita;
    }
    
    
    
    public boolean solicitarCita(){
        return false;
    
    }
    
}
