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
    protected Paciente paciente;

    public Cita(LocalDateTime fecha, boolean pagada, String registradoPor, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
    }
    
    
    public void realizaPago(Pago pago){
        pagada = true;
    }
    
}
