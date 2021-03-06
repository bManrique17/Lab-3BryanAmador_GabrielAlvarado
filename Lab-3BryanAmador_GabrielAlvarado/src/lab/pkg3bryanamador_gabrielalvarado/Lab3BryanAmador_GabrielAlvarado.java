package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3BryanAmador_GabrielAlvarado {

    

    public static void main(String[] args) {
        ArrayList<Locales> listLocales = new ArrayList();
        ArrayList<Empleado> listEmpleados = new ArrayList();
        ArrayList<Producto> listProductos = new ArrayList();
        ArrayList<Cliente> listClientes = new ArrayList();//listCliente
        Scanner sc = new Scanner(System.in);
        char resp = ' ';
        String Usocio = "SOCIO";
        String Usociocontra = "1234";
        do {
            System.out.print("******LOG-IN******\n"
                    + "(1)Ingresar como socio\n"
                    + "(2)Ingresar como cliente\n"
                    + "(3)Registrar un cliente\n"
                    + "->Ingrese su opcion: ");
            String opcion = sc.next();
            if(opcion.equals("1")){
                System.out.println("Ingrese usuario");
                String usuario = sc.next();
                System.out.println("Ingrese contrasena:");
                String contrasena = sc.next();
                if(usuario.equals(Usocio) && contrasena.equals(Usociocontra)){
                    
                }else{
                    System.out.println("INVALIDO");
                    continue;
                }
            }else{
                
            }
                
            switch (opcion) {
                case "1":
                    System.out.println("*******BIENVENIDO SOCIO*******");
                    System.out.println("Ha inciado sesion");
                    char r;
                    do {
                        System.out.print("-------MENU-------\n"
                                + "(1)Locales\n"
                                + "(2)Empleados\n"
                                + "(3)Productos\n"
                                + "->Ingrese su opcion: ");
                        opcion = sc.next();
                        switch (opcion) {
                            case "1":
                                System.out.println("**Locales**");
                                System.out.print("(1)Tienda\n"
                                        + "(2)Quiosco\n"
                                        + "(3)Locales de comida\n"
                                        + "(3)Eliminar locales"
                                        + "->Ingrese su opcion: ");
                                opcion = sc.next();
                                switch (opcion) {
                                    case "1":
                                        System.out.println("***Tiendas***");
                                        switch (CME()) {
                                            case "1":
                                                listLocales.add((Locales) new Tienda());
                                                System.out.println("Usted a creado una tienda");
                                                break;
                                            case "2":
                                                System.out.println("**Modificar tiendas");
                                                for (Locales t : listLocales) {
                                                    if (t instanceof Tienda) {
                                                        System.out.println("(" + listLocales.indexOf(t) + ") " + t);
                                                    }
                                                }
                                                System.out.println("->Ingrese el numero de la tienda que desea modificar: ");
                                                int pos = sc.nextInt();
                                                do {
                                                    System.out.print("(1)Nombre\n"
                                                            + "(2)Piso\n"
                                                            + "(3)Agregar empleados\n"
                                                            + "(4)Agregar productos\n");
                                                    System.out.print("(5)Tamanio\n"
                                                            + "->Ingrese su opcion: ");
                                                    opcion = sc.next();
                                                    switch (opcion) {
                                                        case "1":
                                                            System.out.print("Ingrese el nuevo nombre: \n->");
                                                            listLocales.get(pos).setNombre(sc.next());
                                                            break;
                                                        case "2":
                                                            System.out.print("Ingrese el nuevo piso: \n->");
                                                            listLocales.get(pos).setPiso(sc.nextInt());
                                                            break;
                                                        case "3":
                                                            if (listEmpleados.isEmpty()) {
                                                                System.out.println("No hay empleados");
                                                                break;
                                                            }
                                                            int cont = 1;
                                                            for (Empleado empleado : listEmpleados) {
                                                                System.out.println(cont + " " + empleado);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListEmpleados().add(listEmpleados.get(sc.nextInt()));
                                                            break;
                                                        case "4":
                                                            if (listProductos.isEmpty()) {
                                                                System.out.println("No hay productos");
                                                                break;
                                                            }
                                                            cont = 1;
                                                            for (Producto produc : listProductos) {
                                                                System.out.println(cont + " " + produc);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListProductos().add(listProductos.get(sc.nextInt()));
                                                            break;
                                                        case "5":
                                                            System.out.println("Ingrese el tamanio de la tienda(menor que 18): ");
                                                            int tam = sc.nextInt();
                                                            if (tam > 0 && tam < 19) {
                                                                ((Tienda) listLocales.get(pos)).setTamanio(tam);
                                                            } else {
                                                                System.out.println("Invalido");
                                                            }
                                                            break;
                                                        default:
                                                            System.out.println("Opcion invalida");
                                                    }
                                                    System.out.print("Desea ejecutar otra opcion [S/N]: ");
                                                    r = sc.next().charAt(0);
                                                } while (r == 's' || r == 'S');

                                            default:
                                                System.out.println("invalido");
                                                break;
                                        }
                                        break;
                                    case "2":
                                        System.out.println("***Quioscos***");
                                        switch (CME()) {
                                            case "1":
                                                listLocales.add((Locales) new Quiosco());
                                                System.out.println("Usted a creado un Quiosco");
                                                break;
                                            case "2":
                                                System.out.println("**Modificar Quiosco");
                                                for (Locales t : listLocales) {
                                                    if (t instanceof Quiosco) {
                                                        System.out.println("(" + listLocales.indexOf(t) + ") " + t);
                                                    }
                                                }
                                                System.out.println("->Ingrese el numero de Quiosco que desea modificar: ");
                                                int pos = sc.nextInt();
                                                do {
                                                    System.out.print("(1)Nombre\n"
                                                            + "(2)Piso\n"
                                                            + "(3)Agregar empleados\n"
                                                            + "(4)Agregar productos\n"
                                                            + "->Ingrese su opcion: ");
                                                    opcion = sc.next();
                                                    switch (opcion) {
                                                        case "1":
                                                            System.out.print("Ingrese el nuevo nombre: \n->");
                                                            listLocales.get(pos).setNombre(sc.next());
                                                            break;
                                                        case "2":
                                                            System.out.print("Ingrese el nuevo piso: \n->");
                                                            listLocales.get(pos).setPiso(sc.nextInt());
                                                            break;
                                                        case "3":
                                                            if (listEmpleados.isEmpty()) {
                                                                System.out.println("No hay empleados");
                                                                break;
                                                            }
                                                            int cont = 1;
                                                            for (Empleado empleado : listEmpleados) {
                                                                System.out.println(cont + " " + empleado);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListEmpleados().add(listEmpleados.get(sc.nextInt()));
                                                            break;
                                                        case "4":
                                                            if (listProductos.isEmpty()) {
                                                                System.out.println("No hay productos");
                                                                break;
                                                            }
                                                            cont = 1;
                                                            for (Producto produc : listProductos) {
                                                                System.out.println(cont + " " + produc);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListProductos().add(listProductos.get(sc.nextInt()));
                                                            break;

                                                        default:
                                                            System.out.println("Opcion invalida");
                                                    }
                                                    System.out.print("Desea ejecutar otra opcion [S/N]: ");
                                                    r = sc.next().charAt(0);
                                                } while (r == 's' || r == 'S');

                                        }
                                        break;
                                    case "3":
                                        System.out.println("***Locales Comida***");
                                        switch (CME()) {
                                            case "1":
                                                localComida s = new localComida();
                                                listLocales.add((Locales) new localComida());
                                                System.out.println("Usted a creado una localComida");
                                                break;
                                            case "2":
                                                System.out.println("**Modificar localComida");
                                                for (Locales t : listLocales) {
                                                    if (t instanceof localComida) {
                                                        System.out.println("(" + listLocales.indexOf(t) + ") " + t);
                                                    }
                                                }
                                                System.out.println("->Ingrese el numero de  localComida que desea modificar: ");
                                                int pos = sc.nextInt();
                                                do {
                                                    System.out.print("(1)Nombre\n"
                                                            + "(2)Piso\n"
                                                            + "(3)Agregar empleados\n"
                                                            + "(4)Agregar productos\n"
                                                            + "->Ingrese su opcion: ");
                                                    opcion = sc.next();
                                                    switch (opcion) {
                                                        case "1":
                                                            System.out.print("Ingrese el nuevo nombre: \n->");
                                                            listLocales.get(pos).setNombre(sc.next());
                                                            break;
                                                        case "2":
                                                            System.out.print("Ingrese el nuevo piso: \n->");
                                                            listLocales.get(pos).setPiso(sc.nextInt());
                                                            break;
                                                        case "3":
                                                            if (listEmpleados.isEmpty()) {
                                                                System.out.println("No hay empleados");
                                                                break;
                                                            }
                                                            int cont = 1;
                                                            for (Empleado empleado : listEmpleados) {
                                                                System.out.println(cont + " " + empleado);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            if (listLocales.get(pos).getListEmpleados().size() < 4) {
                                                                listLocales.get(pos).getListEmpleados().add(listEmpleados.get(sc.nextInt()));
                                                            } else {
                                                                System.out.println("Estas en el maximo");
                                                            }
                                                            break;
                                                        case "4":
                                                            if (listProductos.isEmpty()) {
                                                                System.out.println("No hay productos");
                                                                break;
                                                            }
                                                            cont = 1;
                                                            for (Producto produc : listProductos) {
                                                                System.out.println(cont + " " + produc);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");

                                                            listLocales.get(pos).getListProductos().add(listProductos.get(sc.nextInt()));
                                                            break;

                                                        default:
                                                            System.out.println("Opcion invalida");
                                                    }
                                                    System.out.print("Desea ejecutar otra opcion [S/N]: ");
                                                    r = sc.next().charAt(0);
                                                } while (r == 's' || r == 'S');

                                        }

                                        break;
                                    case "4":
                                        if (listLocales.isEmpty()) {
                                            System.out.println("No hay locales");
                                            break;
                                        }
                                        System.out.println("Eliminar");
                                        int cc = 1;
                                        for (Locales x : listLocales) {
                                            System.out.println(cc + " " + x);
                                        }
                                        System.out.println("Ingrese el numero a eliminar");
                                        listLocales.remove(cc);
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
                                }
                                break;
                            case "2":
                                System.out.println("********EMPLEADOS*******");
                                switch (CME()) {
                                    case "1":
                                        listEmpleados.add(new Empleado());
                                        System.out.println("Ha agregado un empleado");
                                        break;
                                    case "2":
                                        if (listEmpleados.isEmpty()) {
                                            System.out.println("No hay empledaos");
                                            break;
                                        }
                                        int cont6 = 1;
                                        for (Empleado E : listEmpleados) {
                                            System.out.println(cont6 + " " + E);
                                        }
                                        System.out.println("Ingrese el numero a modificar: ");
                                        int posi = sc.nextInt();
                                        System.out.println("Ingrese nuevo username: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setUsuario(sc.next());
                                        System.out.println("Ingrese nuevo password: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setContrasena(sc.next());
                                        System.out.println("Ingrese nuevo email: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setEmail(sc.next());
                                        System.out.println("Ingrese nuevo nombre: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setNombreCompleto(sc.next());
                                        System.out.println("Ingrese nuevo ID: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setId(sc.next());
                                        System.out.println("Ingrese fecha nancimiento: ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setFecha(sc.next());
                                        System.out.println("Ingrese horario ");
                                        new Scanner(System.in);
                                        listEmpleados.get(posi).setHorario(sc.nextInt());
                                        System.out.println("Modificado :)");
                                        break;
                                    case "3":

                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        System.out.print("Desea ejecutar otra opcion [S/N]: ");
                        r = sc.next().charAt(0);
                    } while (r == 's' || r == 'S');

                    break;
                case "2":
                    System.out.println("*******BIENVENIDO CLIENTE*******");

                    Scanner leer = new Scanner(System.in);
//Aqui empieza Gabriel
                    opcion = "s";

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
                                for (Cliente a : listClientes) {
                                    cad += listClientes.indexOf(a) + "" + ((Cliente) a);
                                }
                                JOptionPane.showMessageDialog(null, cad);
                            }
                            if (op.equalsIgnoreCase("b")) {
                                String q = "";
                                for (Producto g : listProductos) {
                                    q += listProductos.indexOf(g) + "" + ((Producto) g);
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
                                if (listClientes.get(i).getDinero() > listProductos.get(i2).getPrecio()) {
                                    listClientes.get(i).setDinero(listClientes.get(i).getDinero() - listProductos.get(i2).getPrecio());
                                    listClientes.get(i).getListProducto().add(listProductos.get(i));
                                } else {
                                    JOptionPane.showInputDialog("No tiene suficiente dinero");
                                }

                            }
                        }

                    }
                    System.out.println("Desea continuar [S/N]: ");
                    opcion = sc.next();
            
            break;
                case "3":
                    String op = "";

        while (!op.equalsIgnoreCase(
                "c")) {
            System.out.println("***MENU***\n"
                    + "a.Agregar personas\n"
                    + "b.Modificar Personas\n"
                    + "c.Eliminar Personas\n"
                    + "d.Listar\n"
                    + "c.Salir\n");
        }
        Scanner leer1 = new Scanner(System.in);
        op = leer1.next();

        if (op.equalsIgnoreCase(
                "a")) {
            listClientes.add(new Cliente());

        }

        if (op.equalsIgnoreCase(
                "b")) {
            String usuario;
            String contrasena;
            String nombre;
            String id;
            String fecha;

            String email;

            System.out.println("Ingrese usuario\n");
            usuario = leer1.next();
            System.out.println("Ingrese contraseña\n");
            contrasena = leer1.next();
            System.out.println("Ingrese nombre completo\n");
            nombre = leer1.nextLine();
            System.out.println("Ingrese id\n");
            id = leer1.next();
            System.out.println("Ingrese fecha");
            fecha = JOptionPane.showInputDialog("Ingrese fecha");

            System.out.println("Ingrese email\n");
            email = leer1.next();
            int j;
            System.out.println("Ingrese la posicion\n");
            j = leer1.nextInt();
            listClientes.get(j).setUsuario(usuario);
            listClientes.get(j).setContrasena(contrasena);
            listClientes.get(j).setEmail(email);
            listClientes.get(j).setFecha(fecha);
            listClientes.get(j).setId(id);
            listClientes.get(j).setNombreCompleto(nombre);
        }

        if (op.equalsIgnoreCase(
                "c")) {
            int k;
            System.out.println("Ingrese la posicion a eliminar\n");
            k = leer1.nextInt();
            listClientes.remove(k);
        }

        if (op.equalsIgnoreCase(
                "d")) {
            String o = "";
            for (Cliente arg : listClientes) {
                o += listClientes.indexOf(arg) + "" + ((Cliente) arg);
            }
            JOptionPane.showConfirmDialog(null, o);
        }
        String ele = "";

        System.out.println(
                "***Menu***\n"
                + "a.Factura\n");

        ele = leer1.next();
        int total = 0;
        String cad = "";
        for (Cliente a : listClientes) {
            cad += listClientes.indexOf(a) + "" + ((Cliente) a);
        }

        JOptionPane.showMessageDialog(
                null, cad);

        int l;

        System.out.println(
                "Ingrese la posicion");
        l = leer1.nextInt();
        int tota=0;
        tota=(int)(listClientes.get(l)
                .getListProducto().get(l).getPrecio() * listClientes.get(l).getListProducto().get(l).getDescuento());
        break;
          default:
                    System.out.println("Opcion invalida");
            break;
            }
            System.out.print("Desea continuar [S/N]: ");
        resp = sc.next().charAt(0);
    }while (resp == 's' || resp == 'S');

    }
    

    

    public static String CME() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("(1)Crear\n"
                + "(2)Moficar\n"
                + "(3)Eliminar\n"
                + "->Ingrese su opcion: ");
        return sc1.next();
    }

}



