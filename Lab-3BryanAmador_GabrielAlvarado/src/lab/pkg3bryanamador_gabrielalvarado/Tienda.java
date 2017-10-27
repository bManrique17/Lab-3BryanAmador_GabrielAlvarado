
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;

public class Tienda extends Locales {
    
    public int tamanio;
    ArrayList<Producto> listProductos = new ArrayList();

    public Tienda() {
        super();
    }

    public Tienda(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "tamanio=" + tamanio + '}';
    }
    
    
}
