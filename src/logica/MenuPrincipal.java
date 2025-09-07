
package logica;

import herramientasUtiles.Validador;
import java.util.Scanner;

public class MenuPrincipal {
    
    Scanner sc = new Scanner (System.in);
    Producto p = new Producto();
    VistaProducto v_producto = new VistaProducto();
    ControlProducto c_producto = new ControlProducto(v_producto);
    Inventario i = new Inventario();
    VistaInventario v_inventario = new VistaInventario();
    ControlInventario c_inventario = new ControlInventario(v_inventario,i);
    VistaMenu v_menu = new VistaMenu();
    
    public void mostrarMenu(){
        v_menu.mostrarMenu();
        while(true){ v_menu.mostrarMensaje("1._Interactuar con productos.\n2._Interactuar con el inventario\n3._Salir del programa");
        int opcion = Validador.validarEntero(sc, 1, 3); 
            switch(opcion){
                case 1://INTERACTUAR DIRECTAMENTE CON UN PRODUCTO
                    interaccionProducto();
                    continue;                 
                case 2: //INTERCACTUAR CON EL INVENTARIO
                    interaccionInventario();
                    continue;
                case 3://SALIR DEL PROGRAMA
                    v_menu.mostrarMensaje("Saliendo del programa.");
                    break;
                default: 
                    v_menu.mostrarMensaje("Opcion ingresada no valida");
            }
            break;
        }
    }
    
    public void interaccionProducto (){
        v_menu.mostrarMensaje("Selecciona el numero de la accion deseada");
        while (true){
           v_menu.mostrarMensaje("\n1._Cambiar precio del producto\n2._Mostrar detalles de un producto\n3._Volver al menu principal");
            int opcion = Validador.validarEntero(sc, 1, 3); // CAMBIAR Y VALIDAR
            switch (opcion){
                case 1://ACTUALIZAR DATOS DEL PRODUCTO
                    p = c_inventario.obtenerPorNombre();
                    c_producto.cambiarPrecio(sc, p);
                    continue;
                case 2:
                    p = c_inventario.obtenerPorNombre();
                    v_producto.mostrarDetalles(p);
                    continue;
                case 3: 
                    break;
                default: 
                    v_menu.mostrarMensaje("La opcion ingresada no es valida");
                    continue;
            }
            break;
        }
    }
    
    
    public void interaccionInventario(){
        v_menu.mostrarMensaje("\nSelecciona el numero de la accion deseada");
        while (true){
            v_menu.mostrarMensaje("\n1._Mostrar listado\n2._Buscar por ID\n3._Agregar\n4._Eliminar\n5._Actualizar precio\n"
                    + "6._Generar informe\n7._Volver al menu principal ");
            int opcion =Validador.validarEntero(sc, 1, 7); // CAMBIAR Y VALIDAR
            switch (opcion){
                case 1:// Muestra listado de los productos en inventario
                    c_inventario.mostrarProductos();
                    continue;
                case 2://busca un producto por medio de su id
                    p = c_inventario.obtenerPorId();
                    v_producto.mostrarDetalles(p);
                    continue;
                case 3://agregar productos
                    c_inventario.agregarProductos();
                    continue;
                case 4://elimina productos
                   c_inventario.eliminarProducto();
                    continue;
                case 5://permite actualizar precios del producto
                    p = c_inventario.obtenerPorNombre();
                    c_producto.cambiarPrecio(sc, p);
                    continue;
                case 6: // GENERAR INFORME
                    c_inventario.mostrarInforme();
                    continue;
                case 7:
                    return;
                default:
                    v_menu.mostrarMensaje("La opcion ingresada no es valida");
            }
        }
    }

}
