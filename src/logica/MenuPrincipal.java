
package logica;

import herramientasUtiles.Validador;
import java.util.HashMap;
import java.util.Scanner;


public class MenuPrincipal {
    
    Scanner sc = new Scanner (System.in);
    Producto p = new Producto();
    VistaProducto v_producto = new VistaProducto();
    ControlProducto c_producto = new ControlProducto(v_producto);
    Inventario i = new Inventario();
    VistaInventario v_inventario = new VistaInventario();
    ControlInventario c_inventario = new ControlInventario(v_inventario,i);
    HashMap<String,Producto> productos;
    
    public void mostrarMenu(){
        System.out.println("...:::Bienvenidos al sistema gestor de Inventarios:::...");
        
       
        while(true){ System.out.println("1._Interactuar con productos.\n2._Interactuar con el inventario");
        int opcion = Validador.validarEntero(sc, 1, 3); //SUPONER
            switch(opcion){
                case 1://INTERACTUAR DIRECTAMENTE CON UN PRODUCTO
                    interaccionProducto();
                    continue;
                    
                case 2: //INTERCACTUAR CON EL INVENTARIO
                    interaccionInventario();
                    continue;
                    
                case 3://SALIR DEL PROGRAMA
                    System.out.println("Saliendo del programa.");
                    break;
                default: 
                    System.out.println("Opcion ingresada no valida");
            }
        }
       
    }
    
    public void interaccionProducto (){
        System.out.println("Selecciona el numero de la accion deseada");
        while (true){
            System.out.println("\n1._Actualizar producto\n2._Mostrar detalles de un producto\n3._Volver al menu principal");
            int opcion = Validador.validarEntero(sc, 1, 3); // CAMBIAR Y VALIDAR
            switch (opcion){
                case 1:
                    p = c_inventario.obtenerProducto();
                    c_producto.cambiarPrecio(sc, p);
                    continue;
                case 2:
                    p = c_inventario.obtenerProducto();
                    v_producto.mostrarDetalles(p);
                    continue;
                case 3: 
                    break;
                default: 
                    System.out.println("La opcion ingresada no es valida.");
                    continue;
            }
            break;
        }
    }
    
    
    public void interaccionInventario(){
        System.out.println("\nSelecciona el numero de la accion deseada");
        while (true){
            System.out.println("1._Mostrar listado\n2._Buscar por ID\n3._Agregar\n4._Eliminar\n5._Actualizar\n6._Generar informe"
                    + "\n7._Volver al menu principal ");
            int opcion =Validador.validarEntero(sc, 1, 7); // CAMBIAR Y VALIDAR
            switch (opcion){
                case 1:
                    c_inventario.mostrarProductos();
                    continue;
                case 2:
                    p = c_inventario.obtenerPorId();
                    v_producto.mostrarDetalles(p);
                    continue;
                case 3:
                    c_inventario.agregarProductos();
                    continue;
                case 4:
                   c_inventario.eliminarProducto();
                    continue;
                case 5:
                  //  i.actualizarProducto();
                    continue;
                case 6: // GENERAR INFORME
                    continue;
                case 7:
                    return;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    continue;
            }
        }
    
    }

}
