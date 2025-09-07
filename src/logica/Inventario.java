
package logica;

import java.util.HashMap;

public class Inventario {
    private HashMap <Integer , Producto> productos;

    //CLASE INVENTARIO CON SUS ATRIBUTOS Y LOGICA DE NEGOCIO.
    public Inventario() {
        productos = new HashMap<>();
    }

    public HashMap<Integer, Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProductos(Producto p){
        if (p != null) productos.put(p.getCodigo(), p);
    }
   
    
    public void eliminarProducto(int id){
        if (productos.containsKey(id)) productos.remove(id);
    }
    
    //consulta al hashmap mediante la llave
    public boolean existeProducto(int id) {  
        return productos.containsKey(id);
    }
    
    //consulta al hashmap mediante coincidencia de atributo de uno de los objetos
    public boolean consultaPorNombre(String nombre){
        for (Producto p :productos.values()){
            if (p.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }
}




