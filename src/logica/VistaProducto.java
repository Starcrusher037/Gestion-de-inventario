
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
        System.out.println("\nDescripcion: "+producto.getDescripcion()); 
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
}
