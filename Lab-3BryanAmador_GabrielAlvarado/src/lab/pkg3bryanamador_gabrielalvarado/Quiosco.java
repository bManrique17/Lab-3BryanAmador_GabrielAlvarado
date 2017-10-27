
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;

public class Quiosco extends Locales{
    
    public String nombre;
    ArrayList<Producto> listProducto = new ArrayList();//debe tener uno de cada tipo a mitad de precio

    public Quiosco() {
    }

    public Quiosco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    @Override
    public String toString() {
        return "Quiosco{" + "nombre=" + nombre + '}';
    }
    
    
    
}
