
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;

public class Locales {
    public String nombre;
    public int piso;
    ArrayList<Empleado> listEmpleados = new ArrayList();
    ArrayList<Producto> listProductos = new ArrayList();
    public Empleado empleado;

    public Locales() {
    }

    public Locales(String nombre, int piso, Empleado empleado) {
        this.nombre = nombre;
        this.piso = piso;
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPiso() {
        return piso;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", empleado=" + empleado + '}';
    }
}




