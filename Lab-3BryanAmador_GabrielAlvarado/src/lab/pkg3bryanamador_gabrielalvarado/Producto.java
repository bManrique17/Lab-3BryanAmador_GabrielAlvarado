/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3bryanamador_gabrielalvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Producto {
    public int precio;
    public String descripcion;
    public String marca;
    public double descuento;

    public Producto() {
    }

    public Producto(int precio, String descripcion, String marca, double descuento) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.marca = marca;
        this.descuento = descuento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", descripcion=" + descripcion + ", marca=" + marca + ", descuento=" + descuento + '}';
    }
    
    
}
