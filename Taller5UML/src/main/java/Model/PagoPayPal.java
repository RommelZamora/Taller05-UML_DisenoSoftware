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
public class PagoPayPal implements Pago{
    protected float monto;
    protected String email;
    
    public PagoPayPal(String correo, float valor){
        monto = valor;
        email = correo;
    }

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }

    
}
