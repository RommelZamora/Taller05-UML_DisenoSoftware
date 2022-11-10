/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Grupo 5
 */
public class Medicamento {
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected int cantidadTotal;
    protected String unidad;
    protected Receta receta;

    public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotal, String unidad, Receta receta) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.cantidadTotal = cantidadTotal;
        this.unidad = unidad;
        this.receta = receta;
    }
    
}
