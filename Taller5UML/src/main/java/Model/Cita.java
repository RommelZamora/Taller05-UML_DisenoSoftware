/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Rommel Zamora
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente pacienteReceta;
    
    protected Paciente pacienteCita;
    protected Doctor doctor;
    
    

    public Cita(LocalDateTime fecha, boolean pagada, String registradoPor, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.pacienteReceta = paciente;
    }
    
    
    public void realizaPago(Pago pago){
        pagada = true;
    }
    
}
