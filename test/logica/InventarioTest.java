package logica;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventarioTest {

    private Inventario inventario;
    private Producto producto;

    @Before
    public void creacion() {
        inventario = new Inventario();
        producto = new Producto(101, "CocaCola", "Bebida", 1000, 10);
    }

    @Test
    public void testAgregarProducto() {
        inventario.agregarProductos(producto);
        assertTrue(inventario.existeProducto(101));
    }
    
    @Test
    public void testAgregarProductoNulo(){
        producto = new Producto();
        inventario.agregarProductos(producto);
        assertFalse(inventario.existeProducto(101));
    }

    @Test
    public void testEliminarProdIdInexistente(){
        inventario.agregarProductos(producto);
        inventario.eliminarProducto(107);
        assertTrue(inventario.existeProducto(101));
    }
    
    @Test
    public void testEliminarProducto() {
        inventario.agregarProductos(producto);
        inventario.eliminarProducto(101);
        assertFalse(inventario.existeProducto(101));
    }

    @Test
    public void testConsultaPorNombre() {
        inventario.agregarProductos(producto);
        assertTrue(inventario.consultaPorNombre("CocaCola"));
        assertFalse(inventario.consultaPorNombre("Pepsi"));
    }

    @Test
    public void testBuscarPorCodigo() {
        inventario.agregarProductos(producto);
        assertTrue(inventario.existeProducto(101));
        assertFalse(inventario.existeProducto(999));
    }
}
