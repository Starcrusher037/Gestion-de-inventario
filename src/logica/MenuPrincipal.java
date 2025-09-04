
package logica;

import java.util.Scanner;


public class MenuPrincipal {
    
    Scanner sc = new Scanner (System.in);
    Producto p = new Producto();
    Inventario i = new Inventario();
    
    public void mostrarMenu(Scanner sc){
        System.out.println("...:::Bienvenidos al sistema gestor de Inventarios:::...");
        
        System.out.println("1._Interactuar con productos.\n2._Interactuar con el inventario");
        int opcion = 2; //SUPONER
        while(true){
            switch(opcion){
                case 1://INTERACTUAR DIRECTAMENTE CON UN PRODUCTO
                    interaccionProducto(sc);
                    continue;
                    
                case 2: //INTERCACTUARCON EL INVENTARIO
                    System.out.println("ESTO ES UNA PRUEBA");
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
    
    public void interaccionProducto(Scanner sc ){
        System.out.println("Selecciona el numero de la accion deseada");
        System.out.println("1._Actualizar producto\n2._Mostrar detalles de un producto");
        int opcion =1; // CAMBIAR Y VALIDAR
        switch (opcion){
            case 1:
                p.cambiarPrecio();
                
            case 2:
                p.mostrarDetalles();
                
            default: break;
        }
    }
    
    
    public void interaccionInventario(){
        System.out.println("\nSelecciona el numero de la accion deseada");
        System.out.println("1._Mostrar listado\n2._Buscar por ID\n3._Agregar\n4._Eliminar\n5._Actualizar\n6._Generar informe"
                + "\n7._Volver al menu principal ");
        int opcion =3; // CAMBIAR Y VALIDAR
        switch (opcion){
            case 1:
                i.mostrarListadoProductos();
                
            case 2:
                i.buscarPorCodigo();
                
            case 3:
                i.agregarProductos();
                
            case 4:
                i.eliminarProducto();
                
            case 5:
                i.actualizarProducto();
                
            case 6: // GENERAR INFORME
                
            default: break;
        }
    
    }
}
