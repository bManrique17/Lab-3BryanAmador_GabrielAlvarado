package lab.pkg3bryanamador_gabrielalvarado;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3BryanAmador_GabrielAlvarado {

    public static void main(String[] args) {
        ArrayList<Locales> listLocales = new ArrayList();
        ArrayList<Empleado> listEmpleado = new ArrayList();
        ArrayList<Producto> listProducto = new ArrayList();
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("******LOG-IN******\n"
                    + "(1)Ingresar como socio\n"
                    + "(2)Ingresar como cliente\n"
                    + "(3)Registrar un cliente\n"
                    + "->Ingrese su opcion: ");
            String opcion = sc.next();
            switch (opcion) {
                case "1":
                    System.out.println("*******BIENVENIDO SOCIO*******");
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
                                                            if(listEmpleado.isEmpty()){
                                                                System.out.println("No hay empleados");
                                                                break;
                                                            }
                                                            int cont = 1;
                                                            for (Empleado empleado : listEmpleado) {
                                                                System.out.println(cont+" "+empleado);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListEmpleados().add(listEmpleado.get(sc.nextInt()));
                                                            break;
                                                        case "4":
                                                            if(listEmpleado.isEmpty()){
                                                                System.out.println("No hay empleados");
                                                                break;
                                                            }
                                                            cont = 1;
                                                            for (Empleado empleado : listEmpleado) {
                                                                System.out.println(cont+" "+empleado);
                                                                cont++;
                                                            }
                                                            System.out.println("->Ingrese el numero a agregar: ");
                                                            listLocales.get(pos).getListEmpleados().add(listEmpleado.get(sc.nextInt()));
                                                            break;
                                                        case "5":
                                                            break;
                                                        default:
                                                            System.out.println("Opcion invalida");
                                                    }
                                                    System.out.print("Desea ejecutar otra opcion [S/N]: ");
                                                    r = sc.next().charAt(0);
                                                } while (r == 's' || r == 'S');

                                        }
                                        break;
                                    case "2":
                                        break;
                                    case "3":
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
                                }
                                break;
                            case "2":
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
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.print("Desea continuar [S/N]: ");
            resp = sc.next().charAt(0);
        } while (resp == 's' || resp == 'S');

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



