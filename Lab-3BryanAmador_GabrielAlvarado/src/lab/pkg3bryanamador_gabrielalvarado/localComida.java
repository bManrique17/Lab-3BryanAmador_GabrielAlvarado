
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;

public class localComida extends Locales{
    
    ArrayList<Empleado> listEmpleados = new ArrayList();
    ArrayList<Producto> listProductoAlimenticios = new ArrayList();
    Producto ProcDia;

    public localComida(Producto ProcDia) {
        this.ProcDia = ProcDia;
    }

    public localComida() {
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public ArrayList<Producto> getListProductoAlimenticios() {
        return listProductoAlimenticios;
    }

    public Producto getProcDia() {
        return ProcDia;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public void setListProductoAlimenticios(ArrayList<Producto> listProductoAlimenticios) {
        this.listProductoAlimenticios = listProductoAlimenticios;
    }

    public void setProcDia(Producto ProcDia) {
        this.ProcDia = ProcDia;
    }

    @Override
    public String toString() {
        return "localComida{" + "ProcDia=" + ProcDia + '}';
    }
    
    
    
}
