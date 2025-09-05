
package logica;

import java.util.HashMap;


public class ControlInventario {
    
    private VistaInventario vista ;
    private Inventario modelo;

    public ControlInventario(VistaInventario vista, Inventario modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void agregarProductos(){
        Producto p = vista.crearProducto();
        if (modelo.existeProducto(p.getNombre())) vista.mostrarMensaje("Ya existe un producto con ese nombre");
        else {
            modelo.agregarProductos(p);
            vista.mostrarMensaje("Producto agregado correctamente");
        }
    }
    
    public void mostrarProductos() {
        vista.mostrarListadoProductos(modelo.getProductos());
    }
    
    public Producto obtenerProducto(){
        Producto p;
        String nombre = vista.preguntarNombreProducto();
        if (modelo.existeProducto(nombre)){
            p = modelo.getProductos().get(nombre);
            return p;
        }else return null;   
        
    }
    
    public Producto obtenerPorId(){    
        int id = vista.preguntarIdProducto();
        for (Producto p : modelo.getProductos().values()){
            if (p.getCodigo().equals(id)) return p;
        }
        return null;
    }
    
    public void eliminarProducto(){
        String nombre = vista.preguntarNombreProducto();
        if (modelo.existeProducto(nombre)) {
            modelo.eliminarProducto(nombre);
            vista.mostrarMensaje("Producto eliminado del inventario");
        }
        else vista.mostrarMensaje("El producto no exite en el inventario");
    }
}
