/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author quint
 */
public class Doctor extends Persona{
    
    protected int regDoctor;
    protected String especialidad;
    protected AreaMedica area;    
    protected Secretaria  secretaria;
    protected List<Cita> citasPendientes;
    protected ArrayList<Receta> recetas;

    public Doctor(int regDoctor, String especialidad, AreaMedica area, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.area = area;
        this.recetas = new ArrayList<>();
        this.citasPendientes = new ArrayList<>();
    }

   
    
    
    public void recetar(){
    }
    
    public void agregarPlanNut(){
    
    }
    
    public void imprimirReceta(){
    
    }
    
    public void registraSecretaria(){
    
    }
    
    public void ayudadoPor(Secretaria sec ){
        secretaria= sec;
    }
 
    
    
}
