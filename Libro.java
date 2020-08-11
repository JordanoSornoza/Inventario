/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author PC-Admin
 */
public class Libro {
    private double precio;
    private int cantidad, codigo;

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nCodigo: ");
        sb.append(codigo);
        sb.append("\nPrecio: ");
        sb.append(precio);
        sb.append("\nCantidad: ");
        sb.append(cantidad);   
        return sb.toString();
    }   

}