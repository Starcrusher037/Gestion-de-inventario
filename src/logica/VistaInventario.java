
package logica;

import herramientasUtiles.Validador;
import java.util.HashMap;
import java.util.Scanner;


public class VistaInventario {
    Scanner sc = new Scanner (System.in);

    public VistaInventario() {
    }
    
    //SOLICITA AL USUARIO INGRESAR LOS DATOS PARA CREAR UN PRODUCTO.
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
        return new Producto(nombre,descripcion,precio,cantidad);
    }
    
    //METODO PARA GENERAR INFORMES DEL INVENTARIO
    public void generarInforme(HashMap<Integer, Producto> productos,double valorTotal){
        if(productos.isEmpty()) System.out.println("!!NO HAY PRODUCTOS EN EL INVENTARIO¡¡\n");
        else{
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("\n___INFORME DEL INVENTARIO___");
            System.out.println("Fecha: "+ java.time.LocalDate.now());
            System.out.println("\nCODIGO | NOMBRE              | PRECIO    | STOCK | VALOR TOTAL STOCK");
            for (Producto p : productos.values()){
                int stock = p.getCantidadStock().get();
                double valorTotalStock = stock * p.getPrecio();
                System.out.printf("%-6d | %-18s | %-9.2f | %-5d | %.2f%n",p.getCodigo(),p.getNombre(),p.getPrecio(),stock,valorTotalStock);
            }
            System.out.println("\nCantidad de productos distintos en inventario: "+productos.size());
            System.out.println("Valor total del inventario $"+valorTotal);
             System.out.println("---------------------------------------------------------------------------------------");
        }
    }
    
    //METODO PARA MOSTRAR LISTADO DE LOS PRODUCTOS EXISTENTES          
    public void mostrarListadoProductos(HashMap<Integer, Producto> productos){
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
    
    
    //ESTOS 2 SIGUIENTES METODOS SOLICITAN POR TECLADO EL ID//NOMBRE
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
  
}
