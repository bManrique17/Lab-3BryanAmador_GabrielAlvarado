/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3BryanAmador_GabrielAlvarado {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Cliente> ListCliente = new ArrayList();
    static ArrayList<Producto> ListProductos = new ArrayList();
    static ArrayList<Persona> ListPersonas = new ArrayList();

    public static void main(String[] args) {

        

























































































































































































































































































































































































































































































































//Aqui empieza Gabriel
        String opcion = "";
        while (opcion.equalsIgnoreCase("f")) {
            System.out.println("Ingrese una opcion\n"
                    + "a.Agregar Cliente\n"
                    + "b.Funciones del cliente\n"
                    + "c.Salir\n"
            );
            if (opcion.equalsIgnoreCase("a")) {

                int dinero = 0;
                System.out.println("Agregue la cantidad de dinero");
                dinero = leer.nextInt();
            }

        }
        if (opcion.equalsIgnoreCase("b")) {

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
                    String q = "";
                    for (Producto g : ListProductos) {
                        q += ListProductos.indexOf(g) + "" + ((Producto) g);
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
                    if (ListCliente.get(i).getDinero() > ListProductos.get(i2).getPrecio()) {
                        ListCliente.get(i).setDinero(ListCliente.get(i).getDinero() - ListProductos.get(i2).getPrecio());
                        ListCliente.get(i).getListProducto().add(ListProductos.get(i));
                    } else {
                        JOptionPane.showInputDialog("No tiene suficiente dinero");
                    }

                }
            }

        }
        String op = "";
        while (!op.equalsIgnoreCase("c")) {
            System.out.println("***MENU***\n"
                    + "a.Agregar personas\n"
                    + "b.Modificar Personas\n"
                    + "c.Eliminar Personas\n"
                    + "d.Listar\n"
                    + "c.Salir\n");
        }
        op = leer.next();
        if (op.equalsIgnoreCase("a")) {
            ListCliente.add(new Cliente());

        }
        if (op.equalsIgnoreCase("b")) {
            String usuario;
            String contrasena;
            String nombre;
            String id;
            String fecha;

            String email;
            
            System.out.println("Ingrese usuario\n");
            usuario = leer.next();
            System.out.println("Ingrese contraseña\n");
            contrasena = leer.next();
            System.out.println("Ingrese nombre completo\n");
            nombre = leer.nextLine();
            System.out.println("Ingrese id\n");
            id = leer.next();
            System.out.println("Ingrese fecha");
            fecha = JOptionPane.showInputDialog("Ingrese fecha");

            System.out.println("Ingrese email\n");
            email = leer.next();
            int j;
            System.out.println("Ingrese la posicion\n");
            j = leer.nextInt();
            ListCliente.get(j).setUsuario(usuario);
            ListCliente.get(j).setContrasena(contrasena);
            ListCliente.get(j).setEmail(email);
            ListCliente.get(j).setFecha(fecha);
            ListCliente.get(j).setId(id);
            ListCliente.get(j).setNombreCompleto(nombre);
        }
        if (op.equalsIgnoreCase("c")) {
            int k;
            System.out.println("Ingrese la posicion a eliminar\n");
            k = leer.nextInt();
            ListCliente.remove(k);
        }
        if (op.equalsIgnoreCase("d")) {
            String o="";
            for (Cliente arg : ListCliente) {
                o += ListCliente.indexOf(arg) + "" + ((Cliente)arg);
            }
            JOptionPane.showConfirmDialog(null, o);
        }
        String ele="";
        
        System.out.println("***Menu***\n"
                + "a.Factura\n");
        
      ele = leer.next();
       int total =0;
           String cad = "";
                    for (Cliente a : ListCliente) {
                        cad += ListCliente.indexOf(a) + "" + ((Cliente) a);
                    }
                    JOptionPane.showMessageDialog(null, cad);
                    
                    int l;
                    System.out.println("Ingrese la posicion");
                    l = leer.nextInt();
                   
                    ListCliente.get(l).getListProducto().get(l).getPrecio()+ListCliente.get(l).getListProducto().get(l).getDescuento();
    }

    }
    

