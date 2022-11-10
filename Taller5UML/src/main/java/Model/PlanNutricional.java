/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Rommel Zamora
 */
public class PlanNutricional {
    protected String descripcion;
    protected Receta receta;

    public PlanNutricional(String descripcion, Receta receta) {
        this.descripcion = descripcion;
        this.receta = receta;
    }
    
}
