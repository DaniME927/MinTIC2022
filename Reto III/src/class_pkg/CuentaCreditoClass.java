/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author Usuario
 */
public class CuentaCreditoClass {
    private int saldo_disponible;
    private int numero_tarjeta;

    public CuentaCreditoClass(int saldo_disponible, int numero_tarjeta) {
        this.saldo_disponible = saldo_disponible;
        this.numero_tarjeta = numero_tarjeta;
    }

    public int getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }
    
}
