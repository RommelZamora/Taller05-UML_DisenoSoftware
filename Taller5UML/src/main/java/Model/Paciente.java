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
public class Paciente extends Persona {
    
    protected String email;
    
    protected ArrayList<Receta> recetas;
    
    protected Cita[] cita= new Cita[1];
    protected HistoriaClinica[] historiaClinica;
    
    public Paciente(){
        recetas= new ArrayList();
        
        historiaClinica= new HistoriaClinica[1];
    
    }

    public Paciente(String email, ArrayList<Receta> recetas, HistoriaClinica[] historiaClinica) {
        this.email = email;
        this.recetas = recetas;
        this.historiaClinica = historiaClinica;
    }
    
    public boolean solicitarCita(){
        return false;
    
    }
    
}
