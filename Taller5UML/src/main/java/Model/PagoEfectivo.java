/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author CltControl
 */
public class PagoEfectivo implements Pago{
    protected float monto;

    public PagoEfectivo(float valor) {
        monto = valor;
    }

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
    
    
}
