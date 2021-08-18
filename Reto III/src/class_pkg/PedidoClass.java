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
public class PedidoClass {
    private int total;
    private Estado_Pedido estado;
    private int codigo_pedido;

    public PedidoClass(int total, Estado_Pedido estado, int codigo_pedido) {
        this.total = total;
        this.estado = estado;
        this.codigo_pedido = codigo_pedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Estado_Pedido getEstado() {
        return estado;
    }

    public void setEstado(Estado_Pedido estado) {
        this.estado = estado;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }
}
