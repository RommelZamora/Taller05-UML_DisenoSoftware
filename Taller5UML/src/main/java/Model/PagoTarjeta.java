/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class PagoTarjeta implements Pago{
    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietraio;
    protected String banco;

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
    
}
