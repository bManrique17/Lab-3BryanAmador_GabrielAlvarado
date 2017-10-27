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
public class Juguete extends Producto{
    public String tipo;

    public Juguete() {
        super();
    }

    public Juguete(String tipo, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Juguete{" + "tipo=" + tipo + '}';
    }
    
    
}
