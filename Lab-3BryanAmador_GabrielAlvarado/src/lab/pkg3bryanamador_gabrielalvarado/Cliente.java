/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class Cliente extends Persona{
    public ArrayList<Producto> ListProducto = new ArrayList();
    public int dinero;

    public Cliente() {
        super();
    }

    public Cliente(int dinero) {
        this.dinero = dinero;
        if(this.dinero==0)
        {
            //nada
        }
    }

    public ArrayList<Producto> getListProducto() {
        return ListProducto;
    }

    public void setListProducto(Producto L) {
        ListProducto.add(L);
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + '}';
    }

    
    
}
