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
public class PedidoCompuestoClass extends PedidoClass{
    
    private CuentaCreditoClass cliente; 
    
    public PedidoCompuestoClass(int total, Estado_Pedido estado, int codigo_pedido) {
        super(total, estado, codigo_pedido);
    }

    public CuentaCreditoClass getCliente() {
        return cliente;
    }

    public void setCliente(CuentaCreditoClass cliente) {
        this.cliente = cliente;
    }
    
}
