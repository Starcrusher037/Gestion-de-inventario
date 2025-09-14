
package logica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class IntegracionInventarioTest {
    private VistaInventario vista;
    private Inventario modelo;
    private Producto producto;
    private ControlInventario gestor;
    
    @Before
    public void crearElementosBasicos(){
        vista = new VistaInventario();
        modelo = new Inventario();
        gestor = new ControlInventario(vista,modelo);
        producto = new Producto();
        producto.setCodigo(18);
        producto.setNombre("empanada");
        producto.setDescripcion("empanada con carne picada y merquen cocida en horno de barro");
        producto.setPrecio(2500);
        producto.getCantidadStock().set(200);
    }
    

    @Test
    public void testAgregarYBuscarProductos(){
        modelo.agregarProductos(producto);
        assertEquals(1,modelo.getProductos().size());
        assertEquals("empanada",gestor.obtenerPorId(18).getNombre());
    }
    
    @Test
    public void testAgregarYEliminarProductos(){
        modelo.agregarProductos(producto);
        assertEquals(1,modelo.getProductos().size());
        gestor.eliminarProducto(18); // PRODUCTO ELIMINADO
        assertEquals(0,modelo.getProductos().size());
    }
    
    @Test
    public void testObtenerPorIdYNombre(){
        modelo.agregarProductos(producto);
        assertEquals(18,gestor.obtenerPorId(18).getCodigo());
        assertEquals(18,gestor.obtenerPorNombre("empanada").getCodigo());
    }
    
    @Test
    public void testEliminarInexistente(){
        modelo.agregarProductos(producto);
        assertEquals(1,modelo.getProductos().size());
        gestor.eliminarProducto(100); //ID inexistente (el producto no existe en el inventario)
        assertEquals(1,modelo.getProductos().size());
    }

}
