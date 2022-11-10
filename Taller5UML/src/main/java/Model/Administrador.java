/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Grupo 5
 */
public class Administrador extends Persona{
        
    public ArrayList<Persona> personas;

    public Administrador(ArrayList<Persona> personas, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.personas = new ArrayList<>();
    }
    
    
    public void registraUsuario(){
    }
    
    public void asignarRol(Persona per){
        personas.add(per);
    } 

    @Override
    public boolean logOut() {
        return true;
    }

    @Override
    public boolean logIn() {
        return true;
    }
    
    
    
}
