/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Grupo 5
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;
    protected Pago pago;

    public Cita(LocalDateTime fecha, boolean pagada, String registradoPor, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
        this.doctor = doctor;
    }
    
    public void realizaPago(Pago pago){
        pagada = true;
        this.pago = pago;
    }
    
}
