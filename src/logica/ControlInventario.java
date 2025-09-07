
package logica;

public class ControlInventario {
    
    private VistaInventario vista ;
    private Inventario modelo;

    public ControlInventario(VistaInventario vista, Inventario modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    
    public void agregarProductos(){
        Producto p = vista.crearProducto();
        if (modelo.existeProducto(p.getCodigo())) vista.mostrarMensaje("Ya existe un producto con ese nombre");
        else {
            if(p!=null){
                modelo.agregarProductos(p);
                vista.mostrarMensaje("Producto agregado correctamente");
            }else vista.mostrarMensaje("El producto que intenta agregar no es valido");
        }
    }
    
    public void mostrarProductos() {
        vista.mostrarListadoProductos(modelo.getProductos());
    }
    
    public Producto obtenerPorNombre(){
        Producto p;
        String nombre = vista.preguntarNombreProducto();
        if (modelo.consultaPorNombre(nombre)){
            for (Producto prod : modelo.getProductos().values()){
                if (prod.getNombre().equalsIgnoreCase(nombre)) return prod;
            }
        } 
        return null;
    }
    
    public Producto obtenerPorId(){    
        int id = vista.preguntarIdProducto();
        for (Producto p : modelo.getProductos().values()){
            if (p.getCodigo() == id) {
            return p;
            }
        }
        return null;
    }
    
    public void eliminarProducto(){
        int id = vista.preguntarIdProducto();
        if (modelo.existeProducto(id)) {
            modelo.eliminarProducto(id);
            vista.mostrarMensaje("Producto eliminado del inventario");
        }
        else vista.mostrarMensaje("El producto no exite en el inventario");
    }
    
    public void mostrarInforme(){
        vista.generarInforme(modelo.getProductos(),modelo.precioTotalInventario());
    }
}
