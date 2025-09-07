
package logica;

import herramientasUtiles.Validador;
import java.util.Scanner;

public class VistaProducto {
    Scanner sc = new Scanner(System.in);
    
    public VistaProducto() {   
    }
    
    //METODO PARA MOSTRAR DETALLES DEL PRODUCTO
    public void mostrarDetalles(Producto producto){
        if (producto == null) System.out.println("\nEl producto no existe");
        else{
        System.out.println("__DETALLES DEL PRODUCTO__");
        System.out.println("Nombre: "+producto.getNombre());
        System.out.println("Precio: "+producto.getPrecio());
        System.out.println("Codigo Producto: "+producto.getCodigo());
        System.out.println("Descripcion: "+producto.getDescripcion()); 
        }
    }
    
    public void mostrarNombrePrecioActual(Producto producto){
        System.out.println("El precio para: "+producto.getNombre()+" es de $"+producto.getPrecio());
    }
    
    public int cambiarPrecio(){
        System.out.println("Ingrese el nuevo precio del producto");
        int nuevoPrecio = Validador.validarEntero(sc);
        return nuevoPrecio;
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void crearProducto(Producto producto){
    System.out.println("\nIngresa el nombre del producto");
        String nombre = sc.nextLine();
        System.out.println("Ingrese una descripcion del producto");
        String descripcion = sc.nextLine();
        System.out.println("Ahora ingrese el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad de productos a disposicion");
        int cantidad = sc.nextInt();
        sc.nextLine();     
    }
    
    
    //REVISAR MANANA
    public void actualizarProducto(Producto producto){
    System.out.println("Para el producto: "+producto.getNombre());
    System.out.println("Ingrese una nueva descripcion del producto");
    String descripcion = sc.nextLine();
    System.out.println("Ahora ingrese el nuevo precio del producto");
    double precio = sc.nextDouble();
    System.out.println("Actualice la cantidad de productos en Stock");
    int cantidad = sc.nextInt();
    sc.nextLine();
    producto.setDescripcion(descripcion);
    producto.setPrecio(precio);
    producto.getCantidadStock().addAndGet(cantidad);
    }
}