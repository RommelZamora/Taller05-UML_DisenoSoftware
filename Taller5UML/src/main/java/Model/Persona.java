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
public class Persona {
    
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    
    
    // EL CONSTRUCTOR DEBE TENER ADMINISTRADOR Y NO DEBE TENER ADMINISTRADOR
    
    // la persona es registrada por un adminsitrador 
    protected Administrador registradoPor;
    ///------------------------como hacer para que la persona no cree mas instancias de admin

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.registradoPor = registradoPor;
    }
    
    
    
    public boolean logIn(){
        return false;
    }
    
    public boolean logOut(){
        return false;
    }
    
}
