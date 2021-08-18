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
public class ProductoClass {
    private int codigo_producto;
    private String nombre_producto;
    private int cant_productos_stock;

    public ProductoClass(int codigo_producto, String nombre_producto, int cant_productos_stock) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.cant_productos_stock = cant_productos_stock;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCant_productos_stock() {
        return cant_productos_stock;
    }

    public void setCant_productos_stock(int cant_productos_stock) {
        this.cant_productos_stock = cant_productos_stock;
    }
    
}
