
package logica;

import java.util.HashMap;
import java.util.Scanner;


public class Inventario {
    
    Scanner sc = new Scanner (System.in);
    private HashMap <String , Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public HashMap<String, Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Producto> productos) {
        this.productos = productos;
    }
    
    
    
    //METODO PARA AGREGAR PRODUCTOS
    public void agregarProductos(Producto p){
        if (p != null) productos.put(p.getNombre(), p);
    }
    
    //METODO PARA BUSCAR PRODUCTOS POR CODIGO,  POR NOMBRE Y POR DESCRIPCION
    public boolean buscarPorCodigo(String codigo){
        return productos.containsKey(codigo);
    }
    
    
    //ELIMINAR PRODUCTO DEL INVENTARIO
    public void eliminarProducto(String nombre){
        if (productos.containsKey(nombre)) productos.remove(nombre);
    }
    
    public boolean existeProducto(String nombre) {
        return productos.containsKey(nombre);
    }
}


