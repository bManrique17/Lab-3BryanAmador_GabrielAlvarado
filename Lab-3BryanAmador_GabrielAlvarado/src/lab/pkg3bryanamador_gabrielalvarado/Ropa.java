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
public class Ropa extends Producto{
    public int talla;
    public String genero;

    public Ropa() {
        super();
    }

    public Ropa(int talla, String genero, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.talla = talla;
        this.genero = genero;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", genero=" + genero + '}';
    }
    
}
