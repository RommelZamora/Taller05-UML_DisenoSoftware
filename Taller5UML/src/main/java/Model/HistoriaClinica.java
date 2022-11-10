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
public class HistoriaClinica {
    
    protected Paciente paciente;
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;

    public HistoriaClinica(int nro, Paciente paciente) {
        this.nro = nro;
        this.paciente = paciente;
        this.enfermedades = new ArrayList<>();
        this.alergias = new ArrayList<>();
        this.otros = new ArrayList<>();
    }
    
    
    
}
