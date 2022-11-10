/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Grupo 5
 */
public class Secretaria extends Persona{
   
    protected Doctor doctor;
    protected Cita cita;

    public Secretaria(Doctor doctor, Cita cita, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.doctor = doctor;
        this.cita = cita;
    }

    public void verificarCita(){
    }
    
    public void agendarCita(){}
    
    
}
