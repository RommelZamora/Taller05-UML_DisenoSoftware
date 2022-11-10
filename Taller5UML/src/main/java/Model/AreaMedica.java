/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Grupo 5
 */
public class AreaMedica {
    protected ArrayList<Doctor> doctores;
    protected String especialidad; 
    protected float costo;

    public AreaMedica(String especialidad, float costo) {
        this.especialidad = especialidad;
        this.costo = costo;
        this.doctores = new ArrayList<>();
    }
    
    protected void incluir(Doctor doc){
       doctores.add(doc);
    }
    
}
