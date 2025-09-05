
package logica;

import java.util.Scanner;


public class ControlProducto {
    
    VistaProducto v;

  
    

    public ControlProducto(VistaProducto v) {
        this.v = v;
    }
   
     //METODO PARA ACTUALIZAR PRODUCTO
    public void cambiarPrecio(Scanner sc, Producto producto){
        if (producto == null) {
            v.mostrarMensaje("El producto no existe");
            return;
        }
        v.mostrarNombrePrecioActual(producto);
        producto.setPrecio(v.cambiarPrecio());
        v.mostrarNombrePrecioActual(producto);
    }
    
    
}
