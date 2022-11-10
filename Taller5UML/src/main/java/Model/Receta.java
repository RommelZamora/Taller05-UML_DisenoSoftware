/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Rommel Zamora
 */



public class Receta {
    protected LocalDateTime fecha;
    protected List<Medicamento> medicamentos ;
    protected List<PlanNutricional> nutricion;
    protected Doctor doctor;
    protected Paciente paciente;
    

    public Receta(LocalDateTime fecha, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.medicamentos = new ArrayList<>();
        this.nutricion = new ArrayList<>();
        this.doctor = doctor;
        this.paciente = paciente;
    }
    
    
    
}
