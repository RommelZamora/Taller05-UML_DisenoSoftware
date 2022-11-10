/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author quint
 */
public class Doctor extends Persona{
    
    protected int regDoctor;
    protected String especialidad;
        
    protected Secretaria  secretaria;
    
    protected ArrayList<Cita> citasPendientes = new ArrayList<>();
    
    protected ArrayList<Receta> recetas = new ArrayList<>();
    
    
    
    public void recetar(){
    
    }
    
    public void agregarPlanNut(){
    
    }
    
    
    public void imprimirReceta(){
    
    }
    
    public void registraSecretaria(){
    
    }
    
    void ayudadoPor(Secretaria sec ){
    secretaria= sec;
    
    }
 
    
    
}
