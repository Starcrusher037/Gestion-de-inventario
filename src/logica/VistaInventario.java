
package logica;

import herramientasUtiles.Validador;
import java.util.HashMap;
import java.util.Scanner;


public class VistaInventario {
    Scanner sc = new Scanner (System.in);

    public VistaInventario() {
    }
    
    
    //TRABAJAR AQUI
    public Producto crearProducto(){
        System.out.println("\nIngresa el nombre del producto");
        String nombre = sc.nextLine();
        System.out.println("Ingrese una descripcion del producto");
        String descripcion = sc.nextLine();
        System.out.println("Ahora ingrese el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad de productos a disposicion");
        int cantidad = sc.nextInt();
        sc.nextLine();
        return new Producto("0012",nombre,descripcion,precio,cantidad);
    }
    
    //METODO PARA GENERAR INFORMES DEL INVENTARIO
    public void generarInforme(){
    
    }
    
    
    //METODO PARA MOSTRAR LISTADO DE LOS PRODUCTOS EXISTENTES           ______CORREGIR ESPACIOS______
    public void mostrarListadoProductos(HashMap<String, Producto> productos){
        if(productos.isEmpty()) System.out.println("!!NO HAY PRODUCTOS EN EL INVENTARIO¡¡\n");
        else{
            System.out.printf("%-30s %-10s%n","NOMBRE","CANTIDAD");
            for (Producto p : productos.values()){
            System.out.printf("%-30s %-10s%n",p.getNombre(), p.getCantidadStock());
            }
        }
    }
    
    public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    public int preguntarIdProducto(){
        System.out.println("Ingrese el id del producto");
        int id = Validador.validarEntero(sc);
        return id;
    }
    
    public String preguntarNombreProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.nextLine();
        return nombre;
    }
    
    
      /*PODEMOS JUGAR CON EL METODO PARA DETERMINAR QUE ES LO QUE VA A COMPARAR
    public void existente(Producto p){  
        if (productos.containsValue(p)) System.out.println("Ya existe un producto con ese nombre.");
        else System.out.println("No existe un producto con ese nombre");    
    }
    */
}
