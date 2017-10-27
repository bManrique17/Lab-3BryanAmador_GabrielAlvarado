/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3BryanAmador_GabrielAlvarado {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Cliente> ListCliente = new ArrayList();
    static ArrayList<Producto> ListProductos = new ArrayList();

    public static void main(String[] args) {




























































































































































































































































































































































































































































































































//Aqui empieza Gabriel
        String opcion = "";
        while (opcion.equalsIgnoreCase("f")) {
            System.out.println("Ingrese una opcion\n"
                    + "a.Agregar Cliente\n"
                    + "b.Agregar Productos\n"
                    + "c.Añadir Productos\n"
                    + "d.Salir\n"
            );
            if (opcion.equalsIgnoreCase("a")) {
                int dinero = 0;
                System.out.println("Agregue la cantidad de dinero");
                dinero = leer.nextInt();
            }
            if (opcion.equalsIgnoreCase("b")) {
                int precio;
                String descripcion;
                String marca;
                double descuento;
                System.out.println("Ingrese precion");
                precio = leer.nextInt();
                System.out.println("Ingrese descripcion");
                descripcion = leer.next();
                System.out.println("Ingrese marca");
                marca = leer.next();
                System.out.println("Ingrese descuento");
                descuento = leer.nextDouble();
                ListProductos.add(new Producto(precio, descripcion, marca, descuento));
            }
            
            String op = "";
        while (op.equalsIgnoreCase("f")) {
            System.out.println("Ingrese una opcion\n"
                    + "a.Listar Cliente\n"
                    + "b.Listar Productos\n"
                    + "c.Comprar Productos\n"
                    + "d.Salir\n"
            );
            if (op.equalsIgnoreCase("a")) {
                String cad = "";
                for (Cliente a : ListCliente) {
                    cad += ListCliente.indexOf(a) + "" + ((Cliente) a);
                }
                JOptionPane.showMessageDialog(null, cad);
            }
            if (op.equalsIgnoreCase("b")) {
             String q ="";
                for (Producto g : ListProductos) {
                    q += ListProductos.indexOf(g) + "" + ((Producto)g);
                }
                JOptionPane.showConfirmDialog(null, q);
                
             
             
            }
            if (op.equalsIgnoreCase("c")) {
                int i;
                int i2;
            
                System.out.println("Ingrese la posicion de cliente \n");
                i = leer.nextInt();
                System.out.println("Ingrese la posicion de producto\n");
                i2 = leer.nextInt();
                
                ListCliente.get(i).getListProducto().add(ListProductos.get(i));
            }
        }

    }

}
}
